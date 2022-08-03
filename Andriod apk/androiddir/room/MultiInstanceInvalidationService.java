package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import p009b.p074g.C1251i;
import p009b.p123v.C1768c;
import p009b.p123v.C1771d;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: c */
    public int f960c = 0;

    /* renamed from: d */
    public final C1251i<String> f961d = new C1251i<>();

    /* renamed from: e */
    public final RemoteCallbackList<C1768c> f962e = new C0166a();

    /* renamed from: f */
    public final C1771d f963f = new C0167b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public class C0166a extends RemoteCallbackList<C1768c> {
        public C0166a() {
        }

        public void onCallbackDied(IInterface iInterface, Object obj) {
            C1768c cVar = (C1768c) iInterface;
            MultiInstanceInvalidationService.this.f961d.mo3792h(((Integer) obj).intValue());
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public class C0167b extends C1771d {
        public C0167b() {
        }

        /* renamed from: C0 */
        public int mo1319C0(C1768c cVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f962e) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f960c + 1;
                multiInstanceInvalidationService.f960c = i;
                if (multiInstanceInvalidationService.f962e.register(cVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f961d.mo3784a(i, str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f960c--;
                return 0;
            }
        }

        /* renamed from: N0 */
        public void mo1320N0(C1768c cVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f962e) {
                MultiInstanceInvalidationService.this.f962e.unregister(cVar);
                MultiInstanceInvalidationService.this.f961d.mo3792h(i);
            }
        }

        /* renamed from: b0 */
        public void mo1321b0(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f962e) {
                String e = MultiInstanceInvalidationService.this.f961d.mo3789e(i, null);
                if (e == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f962e.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f962e.getBroadcastCookie(i2)).intValue();
                        String d = MultiInstanceInvalidationService.this.f961d.mo3788d(intValue);
                        if (i != intValue && e.equals(d)) {
                            MultiInstanceInvalidationService.this.f962e.getBroadcastItem(i2).mo4961C1(strArr);
                        }
                    } catch (RemoteException e2) {
                        Log.w("ROOM", "Error invoking a remote callback", e2);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f962e.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f962e.finishBroadcast();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f963f;
    }
}

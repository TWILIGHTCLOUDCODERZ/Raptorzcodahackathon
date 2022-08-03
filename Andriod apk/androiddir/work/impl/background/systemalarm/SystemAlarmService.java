package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;
import p009b.p033c0.C0468h;
import p009b.p033c0.p034r.p035m.p037b.C0509e;
import p009b.p033c0.p034r.p043p.C0584k;
import p009b.p114q.C1670j;

public class SystemAlarmService extends C1670j implements C0509e.C0512c {

    /* renamed from: f */
    public static final String f1004f = C0468h.m1649e("SystemAlarmService");

    /* renamed from: d */
    public C0509e f1005d;

    /* renamed from: e */
    public boolean f1006e;

    /* renamed from: a */
    public final void mo1374a() {
        C0509e eVar = new C0509e(this);
        this.f1005d = eVar;
        if (eVar.f2221l != null) {
            C0468h.m1648c().mo2729b(C0509e.f2211m, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            eVar.f2221l = this;
        }
    }

    /* renamed from: e */
    public void mo1375e() {
        this.f1006e = true;
        C0468h.m1648c().mo2728a(f1004f, "All commands completed in dispatcher", new Throwable[0]);
        String str = C0584k.f2354a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = C0584k.f2355b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C0468h.m1648c().mo2731f(C0584k.f2354a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        mo1374a();
        this.f1006e = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1006e = true;
        this.f1005d.mo2772d();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1006e) {
            C0468h.m1648c().mo2730d(f1004f, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1005d.mo2772d();
            mo1374a();
            this.f1006e = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1005d.mo2770b(intent, i2);
        return 3;
    }
}

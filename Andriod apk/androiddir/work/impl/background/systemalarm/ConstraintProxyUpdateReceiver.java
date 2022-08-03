package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p009b.p033c0.C0468h;
import p009b.p033c0.p034r.C0499i;
import p009b.p033c0.p034r.p043p.C0578f;
import p009b.p033c0.p034r.p043p.p045m.C0599b;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f999a = C0468h.m1649e("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class C0177a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Intent f1000c;

        /* renamed from: d */
        public final /* synthetic */ Context f1001d;

        /* renamed from: e */
        public final /* synthetic */ BroadcastReceiver.PendingResult f1002e;

        public C0177a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f1000c = intent;
            this.f1001d = context;
            this.f1002e = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f1000c.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f1000c.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f1000c.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f1000c.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C0468h.m1648c().mo2728a(ConstraintProxyUpdateReceiver.f999a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C0578f.m1827a(this.f1001d, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C0578f.m1827a(this.f1001d, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C0578f.m1827a(this.f1001d, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C0578f.m1827a(this.f1001d, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f1002e.finish();
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C0468h.m1648c().mo2728a(f999a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ((C0599b) C0499i.m1681c(context).f2148d).f2385a.execute(new C0177a(this, intent, context, goAsync));
    }
}

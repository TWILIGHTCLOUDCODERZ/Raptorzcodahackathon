package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p009b.p033c0.C0468h;
import p009b.p033c0.p034r.p035m.p037b.C0506b;

public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f998a = C0468h.m1649e("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    public void onReceive(Context context, Intent intent) {
        C0468h.m1648c().mo2728a(f998a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C0506b.m1702b(context));
    }
}

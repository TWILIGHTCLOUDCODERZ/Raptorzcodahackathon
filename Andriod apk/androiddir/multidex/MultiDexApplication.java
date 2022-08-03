package androidx.multidex;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.util.Set;
import p009b.p120t.C1711a;
import p133c.p149b.p152b.p153a.C2108a;

public class MultiDexApplication extends Application {
    public void attachBaseContext(Context context) {
        String str;
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        Set<File> set = C1711a.f5196a;
        Log.i("MultiDex", "Installing application");
        if (C1711a.f5197b) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else {
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e) {
                try {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                    applicationInfo = null;
                } catch (Exception e2) {
                    Log.e("MultiDex", "MultiDex installation failure", e2);
                    StringBuilder o = C2108a.m5005o("MultiDex installation failed (");
                    o.append(e2.getMessage());
                    o.append(").");
                    throw new RuntimeException(o.toString());
                }
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            C1711a.m4135c(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
            str = "install done";
        }
        Log.i("MultiDex", str);
    }
}

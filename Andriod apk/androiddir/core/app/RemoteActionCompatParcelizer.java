package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import p009b.p027b0.C0439a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C0439a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f583a;
        if (aVar.mo2670i(1)) {
            obj = aVar.mo2676o();
        }
        remoteActionCompat.f583a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f584b;
        if (aVar.mo2670i(2)) {
            charSequence = aVar.mo2669h();
        }
        remoteActionCompat.f584b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f585c;
        if (aVar.mo2670i(3)) {
            charSequence2 = aVar.mo2669h();
        }
        remoteActionCompat.f585c = charSequence2;
        remoteActionCompat.f586d = (PendingIntent) aVar.mo2674m(remoteActionCompat.f586d, 4);
        boolean z = remoteActionCompat.f587e;
        if (aVar.mo2670i(5)) {
            z = aVar.mo2667f();
        }
        remoteActionCompat.f587e = z;
        boolean z2 = remoteActionCompat.f588f;
        if (aVar.mo2670i(6)) {
            z2 = aVar.mo2667f();
        }
        remoteActionCompat.f588f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C0439a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f583a;
        aVar.mo2677p(1);
        aVar.mo2684w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f584b;
        aVar.mo2677p(2);
        aVar.mo2680s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f585c;
        aVar.mo2677p(3);
        aVar.mo2680s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f586d;
        aVar.mo2677p(4);
        aVar.mo2682u(pendingIntent);
        boolean z = remoteActionCompat.f587e;
        aVar.mo2677p(5);
        aVar.mo2678q(z);
        boolean z2 = remoteActionCompat.f588f;
        aVar.mo2677p(6);
        aVar.mo2678q(z2);
    }
}

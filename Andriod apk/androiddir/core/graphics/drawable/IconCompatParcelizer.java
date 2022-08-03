package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;
import p009b.p027b0.C0439a;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(p009b.p027b0.C0439a r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f596a
            r2 = 1
            int r1 = r5.mo2672k(r1, r2)
            r0.f596a = r1
            byte[] r1 = r0.f598c
            r2 = 2
            boolean r3 = r5.mo2670i(r2)
            if (r3 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            byte[] r1 = r5.mo2668g()
        L_0x001c:
            r0.f598c = r1
            android.os.Parcelable r1 = r0.f599d
            r3 = 3
            android.os.Parcelable r1 = r5.mo2674m(r1, r3)
            r0.f599d = r1
            int r1 = r0.f600e
            r4 = 4
            int r1 = r5.mo2672k(r1, r4)
            r0.f600e = r1
            int r1 = r0.f601f
            r4 = 5
            int r1 = r5.mo2672k(r1, r4)
            r0.f601f = r1
            android.content.res.ColorStateList r1 = r0.f602g
            r4 = 6
            android.os.Parcelable r1 = r5.mo2674m(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f602g = r1
            java.lang.String r1 = r0.f604i
            r4 = 7
            boolean r4 = r5.mo2670i(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            java.lang.String r1 = r5.mo2675n()
        L_0x0052:
            r0.f604i = r1
            java.lang.String r1 = r0.f605j
            r4 = 8
            boolean r4 = r5.mo2670i(r4)
            if (r4 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            java.lang.String r1 = r5.mo2675n()
        L_0x0063:
            r0.f605j = r1
            java.lang.String r5 = r0.f604i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f603h = r5
            int r5 = r0.f596a
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00ad;
                case 0: goto L_0x0073;
                case 1: goto L_0x009c;
                case 2: goto L_0x0079;
                case 3: goto L_0x0074;
                case 4: goto L_0x0079;
                case 5: goto L_0x009c;
                case 6: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x00bc
        L_0x0074:
            byte[] r5 = r0.f598c
            r0.f597b = r5
            goto L_0x00bc
        L_0x0079:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f598c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f597b = r5
            int r3 = r0.f596a
            if (r3 != r2) goto L_0x00bc
            java.lang.String r2 = r0.f605j
            if (r2 != 0) goto L_0x00bc
            r2 = -1
            java.lang.String r3 = ":"
            java.lang.String[] r5 = r5.split(r3, r2)
            r5 = r5[r1]
            r0.f605j = r5
            goto L_0x00bc
        L_0x009c:
            android.os.Parcelable r5 = r0.f599d
            if (r5 == 0) goto L_0x00a1
            goto L_0x00b1
        L_0x00a1:
            byte[] r5 = r0.f598c
            r0.f597b = r5
            r0.f596a = r3
            r0.f600e = r1
            int r5 = r5.length
            r0.f601f = r5
            goto L_0x00bc
        L_0x00ad:
            android.os.Parcelable r5 = r0.f599d
            if (r5 == 0) goto L_0x00b4
        L_0x00b1:
            r0.f597b = r5
            goto L_0x00bc
        L_0x00b4:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(b.b0.a):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, C0439a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.f604i = iconCompat.f603h.name();
        switch (iconCompat.f596a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f599d = (Parcelable) iconCompat.f597b;
                break;
            case 2:
                iconCompat.f598c = ((String) iconCompat.f597b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f598c = (byte[]) iconCompat.f597b;
                break;
            case 4:
            case 6:
                iconCompat.f598c = iconCompat.f597b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f596a;
        if (-1 != i) {
            aVar.mo2677p(1);
            aVar.mo2681t(i);
        }
        byte[] bArr = iconCompat.f598c;
        if (bArr != null) {
            aVar.mo2677p(2);
            aVar.mo2679r(bArr);
        }
        Parcelable parcelable = iconCompat.f599d;
        if (parcelable != null) {
            aVar.mo2677p(3);
            aVar.mo2682u(parcelable);
        }
        int i2 = iconCompat.f600e;
        if (i2 != 0) {
            aVar.mo2677p(4);
            aVar.mo2681t(i2);
        }
        int i3 = iconCompat.f601f;
        if (i3 != 0) {
            aVar.mo2677p(5);
            aVar.mo2681t(i3);
        }
        ColorStateList colorStateList = iconCompat.f602g;
        if (colorStateList != null) {
            aVar.mo2677p(6);
            aVar.mo2682u(colorStateList);
        }
        String str = iconCompat.f604i;
        if (str != null) {
            aVar.mo2677p(7);
            aVar.mo2683v(str);
        }
        String str2 = iconCompat.f605j;
        if (str2 != null) {
            aVar.mo2677p(8);
            aVar.mo2683v(str2);
        }
    }
}

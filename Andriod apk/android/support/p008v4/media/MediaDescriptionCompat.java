package android.support.p008v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0016a();

    /* renamed from: c */
    public final String f10c;

    /* renamed from: d */
    public final CharSequence f11d;

    /* renamed from: e */
    public final CharSequence f12e;

    /* renamed from: f */
    public final CharSequence f13f;

    /* renamed from: g */
    public final Bitmap f14g;

    /* renamed from: h */
    public final Uri f15h;

    /* renamed from: i */
    public final Bundle f16i;

    /* renamed from: j */
    public final Uri f17j;

    /* renamed from: k */
    public Object f18k;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static class C0016a implements Parcelable.Creator<MediaDescriptionCompat> {
        public Object createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m12a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f10c = str;
        this.f11d = charSequence;
        this.f12e = charSequence2;
        this.f13f = charSequence3;
        this.f14g = bitmap;
        this.f15h = uri;
        this.f16i = bundle;
        this.f17j = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p008v4.media.MediaDescriptionCompat m12a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x005b
            r1 = r14
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r3 = r1.getMediaId()
            java.lang.CharSequence r4 = r1.getTitle()
            java.lang.CharSequence r5 = r1.getSubtitle()
            java.lang.CharSequence r6 = r1.getDescription()
            android.graphics.Bitmap r7 = r1.getIconBitmap()
            android.net.Uri r8 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0030
            android.support.p008v4.media.session.MediaSessionCompat.m13a(r2)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x0031
        L_0x0030:
            r10 = r0
        L_0x0031:
            if (r10 == 0) goto L_0x004a
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x0044
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x0044
            r9 = r0
            goto L_0x004b
        L_0x0044:
            r2.remove(r9)
            r2.remove(r11)
        L_0x004a:
            r9 = r2
        L_0x004b:
            if (r10 == 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            android.net.Uri r0 = r1.getMediaUri()
            r10 = r0
        L_0x0053:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f18k = r14
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p008v4.media.MediaDescriptionCompat.m12a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f11d + ", " + this.f12e + ", " + this.f13f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Object obj = this.f18k;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f10c);
            builder.setTitle(this.f11d);
            builder.setSubtitle(this.f12e);
            builder.setDescription(this.f13f);
            builder.setIconBitmap(this.f14g);
            builder.setIconUri(this.f15h);
            builder.setExtras(this.f16i);
            builder.setMediaUri(this.f17j);
            obj = builder.build();
            this.f18k = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}

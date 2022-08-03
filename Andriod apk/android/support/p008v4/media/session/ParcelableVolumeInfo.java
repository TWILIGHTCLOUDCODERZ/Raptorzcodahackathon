package android.support.p008v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0023a();

    /* renamed from: c */
    public int f28c;

    /* renamed from: d */
    public int f29d;

    /* renamed from: e */
    public int f30e;

    /* renamed from: f */
    public int f31f;

    /* renamed from: g */
    public int f32g;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public static class C0023a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f28c = parcel.readInt();
        this.f30e = parcel.readInt();
        this.f31f = parcel.readInt();
        this.f32g = parcel.readInt();
        this.f29d = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28c);
        parcel.writeInt(this.f30e);
        parcel.writeInt(this.f31f);
        parcel.writeInt(this.f32g);
        parcel.writeInt(this.f29d);
    }
}

package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p009b.p027b0.C0440b;
import p009b.p027b0.C0441c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0169a();

    /* renamed from: c */
    public final C0441c f969c;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C0169a implements Parcelable.Creator<ParcelImpl> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f969c = new C0440b(parcel).mo2676o();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0440b(parcel).mo2684w(this.f969c);
    }
}

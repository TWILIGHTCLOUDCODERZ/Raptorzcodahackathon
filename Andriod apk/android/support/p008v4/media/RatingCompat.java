package android.support.p008v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p133c.p149b.p152b.p153a.C2108a;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0018a();

    /* renamed from: c */
    public final int f21c;

    /* renamed from: d */
    public final float f22d;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    public static class C0018a implements Parcelable.Creator<RatingCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f21c = i;
        this.f22d = f;
    }

    public int describeContents() {
        return this.f21c;
    }

    public String toString() {
        StringBuilder o = C2108a.m5005o("Rating:style=");
        o.append(this.f21c);
        o.append(" rating=");
        float f = this.f22d;
        o.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return o.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21c);
        parcel.writeFloat(this.f22d);
    }
}

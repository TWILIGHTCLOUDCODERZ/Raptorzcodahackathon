package android.support.p008v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p133c.p149b.p152b.p153a.C2108a;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0025a();

    /* renamed from: c */
    public final int f33c;

    /* renamed from: d */
    public final long f34d;

    /* renamed from: e */
    public final long f35e;

    /* renamed from: f */
    public final float f36f;

    /* renamed from: g */
    public final long f37g;

    /* renamed from: h */
    public final int f38h;

    /* renamed from: i */
    public final CharSequence f39i;

    /* renamed from: j */
    public final long f40j;

    /* renamed from: k */
    public List<CustomAction> f41k;

    /* renamed from: l */
    public final long f42l;

    /* renamed from: m */
    public final Bundle f43m;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0024a();

        /* renamed from: c */
        public final String f44c;

        /* renamed from: d */
        public final CharSequence f45d;

        /* renamed from: e */
        public final int f46e;

        /* renamed from: f */
        public final Bundle f47f;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public static class C0024a implements Parcelable.Creator<CustomAction> {
            public Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f44c = parcel.readString();
            this.f45d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f46e = parcel.readInt();
            this.f47f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder o = C2108a.m5005o("Action:mName='");
            o.append(this.f45d);
            o.append(", mIcon=");
            o.append(this.f46e);
            o.append(", mExtras=");
            o.append(this.f47f);
            return o.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f44c);
            TextUtils.writeToParcel(this.f45d, parcel, i);
            parcel.writeInt(this.f46e);
            parcel.writeBundle(this.f47f);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static class C0025a implements Parcelable.Creator<PlaybackStateCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f33c = parcel.readInt();
        this.f34d = parcel.readLong();
        this.f36f = parcel.readFloat();
        this.f40j = parcel.readLong();
        this.f35e = parcel.readLong();
        this.f37g = parcel.readLong();
        this.f39i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f41k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f42l = parcel.readLong();
        this.f43m = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f38h = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f33c + ", position=" + this.f34d + ", buffered position=" + this.f35e + ", speed=" + this.f36f + ", updated=" + this.f40j + ", actions=" + this.f37g + ", error code=" + this.f38h + ", error message=" + this.f39i + ", custom actions=" + this.f41k + ", active item id=" + this.f42l + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33c);
        parcel.writeLong(this.f34d);
        parcel.writeFloat(this.f36f);
        parcel.writeLong(this.f40j);
        parcel.writeLong(this.f35e);
        parcel.writeLong(this.f37g);
        TextUtils.writeToParcel(this.f39i, parcel, i);
        parcel.writeTypedList(this.f41k);
        parcel.writeLong(this.f42l);
        parcel.writeBundle(this.f43m);
        parcel.writeInt(this.f38h);
    }
}

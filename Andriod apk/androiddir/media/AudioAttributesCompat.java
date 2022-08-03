package androidx.media;

import android.util.SparseIntArray;
import p009b.p027b0.C0441c;

public class AudioAttributesCompat implements C0441c {

    /* renamed from: b */
    public static final SparseIntArray f663b;

    /* renamed from: a */
    public AudioAttributesImpl f664a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f663b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f664a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f664a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.f664a.hashCode();
    }

    public String toString() {
        return this.f664a.toString();
    }
}

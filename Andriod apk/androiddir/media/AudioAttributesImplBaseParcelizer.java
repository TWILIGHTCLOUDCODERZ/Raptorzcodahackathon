package androidx.media;

import java.util.Objects;
import p009b.p027b0.C0439a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C0439a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f667a = aVar.mo2672k(audioAttributesImplBase.f667a, 1);
        audioAttributesImplBase.f668b = aVar.mo2672k(audioAttributesImplBase.f668b, 2);
        audioAttributesImplBase.f669c = aVar.mo2672k(audioAttributesImplBase.f669c, 3);
        audioAttributesImplBase.f670d = aVar.mo2672k(audioAttributesImplBase.f670d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C0439a aVar) {
        Objects.requireNonNull(aVar);
        int i = audioAttributesImplBase.f667a;
        aVar.mo2677p(1);
        aVar.mo2681t(i);
        int i2 = audioAttributesImplBase.f668b;
        aVar.mo2677p(2);
        aVar.mo2681t(i2);
        int i3 = audioAttributesImplBase.f669c;
        aVar.mo2677p(3);
        aVar.mo2681t(i3);
        int i4 = audioAttributesImplBase.f670d;
        aVar.mo2677p(4);
        aVar.mo2681t(i4);
    }
}

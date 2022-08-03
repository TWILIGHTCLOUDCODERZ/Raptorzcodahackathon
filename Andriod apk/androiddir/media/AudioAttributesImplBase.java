package androidx.media;

import android.util.SparseIntArray;
import java.util.Arrays;
import p133c.p149b.p152b.p153a.C2108a;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f667a = 0;

    /* renamed from: b */
    public int f668b = 0;

    /* renamed from: c */
    public int f669c = 0;

    /* renamed from: d */
    public int f670d = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f668b != audioAttributesImplBase.f668b) {
            return false;
        }
        int i = this.f669c;
        int i2 = audioAttributesImplBase.f669c;
        int i3 = audioAttributesImplBase.f670d;
        int i4 = 4;
        if (i3 == -1) {
            int i5 = audioAttributesImplBase.f667a;
            SparseIntArray sparseIntArray = AudioAttributesCompat.f663b;
            if ((i2 & 1) != 1) {
                if ((i2 & 4) != 4) {
                    switch (i5) {
                        case 2:
                            i4 = 0;
                            break;
                        case 3:
                            i4 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i4 = 5;
                            break;
                        case 6:
                            i4 = 2;
                            break;
                        case 11:
                            i4 = 10;
                            break;
                        case 13:
                            i4 = 1;
                            break;
                        default:
                            i4 = 3;
                            break;
                    }
                } else {
                    i4 = 6;
                }
            } else {
                i4 = 7;
            }
        } else {
            i4 = i3;
        }
        if (i4 == 6) {
            i2 |= 4;
        } else if (i4 == 7) {
            i2 |= 1;
        }
        if (i == (i2 & 273) && this.f667a == audioAttributesImplBase.f667a && this.f670d == i3) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f668b), Integer.valueOf(this.f669c), Integer.valueOf(this.f667a), Integer.valueOf(this.f670d)});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f670d != -1) {
            sb.append(" stream=");
            sb.append(this.f670d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f667a;
        SparseIntArray sparseIntArray = AudioAttributesCompat.f663b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = C2108a.m4995e("unknown usage ", i);
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f668b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f669c).toUpperCase());
        return sb.toString();
    }
}

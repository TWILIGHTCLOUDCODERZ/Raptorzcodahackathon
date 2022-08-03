package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p009b.p077i.p080b.C1274d;
import p009b.p077i.p080b.p081h.C1286d;
import p009b.p077i.p080b.p081h.C1288e;
import p009b.p077i.p080b.p081h.C1289f;
import p009b.p077i.p080b.p081h.p082l.C1296b;
import p009b.p077i.p083c.C1317b;
import p009b.p077i.p083c.C1318c;
import p009b.p077i.p083c.C1321d;
import p009b.p077i.p083c.C1329f;
import p009b.p077i.p083c.C1330g;
import p009b.p077i.p083c.C1332i;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: c */
    public SparseArray<View> f445c = new SparseArray<>();

    /* renamed from: d */
    public ArrayList<C1317b> f446d = new ArrayList<>(4);

    /* renamed from: e */
    public C1288e f447e = new C1288e();

    /* renamed from: f */
    public int f448f = 0;

    /* renamed from: g */
    public int f449g = 0;

    /* renamed from: h */
    public int f450h = Integer.MAX_VALUE;

    /* renamed from: i */
    public int f451i = Integer.MAX_VALUE;

    /* renamed from: j */
    public boolean f452j = true;

    /* renamed from: k */
    public int f453k = 257;

    /* renamed from: l */
    public C1321d f454l = null;

    /* renamed from: m */
    public C1318c f455m = null;

    /* renamed from: n */
    public int f456n = -1;

    /* renamed from: o */
    public HashMap<String, Integer> f457o = new HashMap<>();

    /* renamed from: p */
    public int f458p = -1;

    /* renamed from: q */
    public int f459q = -1;

    /* renamed from: r */
    public SparseArray<C1286d> f460r = new SparseArray<>();

    /* renamed from: s */
    public C0089b f461s = new C0089b(this);

    /* renamed from: t */
    public int f462t = 0;

    /* renamed from: u */
    public int f463u = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0087a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f464A = 0.5f;

        /* renamed from: B */
        public String f465B = null;

        /* renamed from: C */
        public int f466C = 1;

        /* renamed from: D */
        public float f467D = -1.0f;

        /* renamed from: E */
        public float f468E = -1.0f;

        /* renamed from: F */
        public int f469F = 0;

        /* renamed from: G */
        public int f470G = 0;

        /* renamed from: H */
        public int f471H = 0;

        /* renamed from: I */
        public int f472I = 0;

        /* renamed from: J */
        public int f473J = 0;

        /* renamed from: K */
        public int f474K = 0;

        /* renamed from: L */
        public int f475L = 0;

        /* renamed from: M */
        public int f476M = 0;

        /* renamed from: N */
        public float f477N = 1.0f;

        /* renamed from: O */
        public float f478O = 1.0f;

        /* renamed from: P */
        public int f479P = -1;

        /* renamed from: Q */
        public int f480Q = -1;

        /* renamed from: R */
        public int f481R = -1;

        /* renamed from: S */
        public boolean f482S = false;

        /* renamed from: T */
        public boolean f483T = false;

        /* renamed from: U */
        public String f484U = null;

        /* renamed from: V */
        public boolean f485V = true;

        /* renamed from: W */
        public boolean f486W = true;

        /* renamed from: X */
        public boolean f487X = false;

        /* renamed from: Y */
        public boolean f488Y = false;

        /* renamed from: Z */
        public boolean f489Z = false;

        /* renamed from: a */
        public int f490a = -1;

        /* renamed from: a0 */
        public boolean f491a0 = false;

        /* renamed from: b */
        public int f492b = -1;

        /* renamed from: b0 */
        public int f493b0 = -1;

        /* renamed from: c */
        public float f494c = -1.0f;

        /* renamed from: c0 */
        public int f495c0 = -1;

        /* renamed from: d */
        public int f496d = -1;

        /* renamed from: d0 */
        public int f497d0 = -1;

        /* renamed from: e */
        public int f498e = -1;

        /* renamed from: e0 */
        public int f499e0 = -1;

        /* renamed from: f */
        public int f500f = -1;

        /* renamed from: f0 */
        public int f501f0 = -1;

        /* renamed from: g */
        public int f502g = -1;

        /* renamed from: g0 */
        public int f503g0 = -1;

        /* renamed from: h */
        public int f504h = -1;

        /* renamed from: h0 */
        public float f505h0 = 0.5f;

        /* renamed from: i */
        public int f506i = -1;

        /* renamed from: i0 */
        public int f507i0;

        /* renamed from: j */
        public int f508j = -1;

        /* renamed from: j0 */
        public int f509j0;

        /* renamed from: k */
        public int f510k = -1;

        /* renamed from: k0 */
        public float f511k0;

        /* renamed from: l */
        public int f512l = -1;

        /* renamed from: l0 */
        public C1286d f513l0 = new C1286d();

        /* renamed from: m */
        public int f514m = -1;

        /* renamed from: n */
        public int f515n = 0;

        /* renamed from: o */
        public float f516o = 0.0f;

        /* renamed from: p */
        public int f517p = -1;

        /* renamed from: q */
        public int f518q = -1;

        /* renamed from: r */
        public int f519r = -1;

        /* renamed from: s */
        public int f520s = -1;

        /* renamed from: t */
        public int f521t = -1;

        /* renamed from: u */
        public int f522u = -1;

        /* renamed from: v */
        public int f523v = -1;

        /* renamed from: w */
        public int f524w = -1;

        /* renamed from: x */
        public int f525x = -1;

        /* renamed from: y */
        public int f526y = -1;

        /* renamed from: z */
        public float f527z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class C0088a {

            /* renamed from: a */
            public static final SparseIntArray f528a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f528a = sparseIntArray;
                sparseIntArray.append(64, 8);
                sparseIntArray.append(65, 9);
                sparseIntArray.append(67, 10);
                sparseIntArray.append(68, 11);
                sparseIntArray.append(74, 12);
                sparseIntArray.append(73, 13);
                sparseIntArray.append(46, 14);
                sparseIntArray.append(45, 15);
                sparseIntArray.append(43, 16);
                sparseIntArray.append(47, 2);
                sparseIntArray.append(49, 3);
                sparseIntArray.append(48, 4);
                sparseIntArray.append(82, 49);
                sparseIntArray.append(83, 50);
                sparseIntArray.append(53, 5);
                sparseIntArray.append(54, 6);
                sparseIntArray.append(55, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(69, 17);
                sparseIntArray.append(70, 18);
                sparseIntArray.append(52, 19);
                sparseIntArray.append(51, 20);
                sparseIntArray.append(86, 21);
                sparseIntArray.append(89, 22);
                sparseIntArray.append(87, 23);
                sparseIntArray.append(84, 24);
                sparseIntArray.append(88, 25);
                sparseIntArray.append(85, 26);
                sparseIntArray.append(60, 29);
                sparseIntArray.append(75, 30);
                sparseIntArray.append(50, 44);
                sparseIntArray.append(62, 45);
                sparseIntArray.append(77, 46);
                sparseIntArray.append(61, 47);
                sparseIntArray.append(76, 48);
                sparseIntArray.append(41, 27);
                sparseIntArray.append(40, 28);
                sparseIntArray.append(78, 31);
                sparseIntArray.append(56, 32);
                sparseIntArray.append(80, 33);
                sparseIntArray.append(79, 34);
                sparseIntArray.append(81, 35);
                sparseIntArray.append(58, 36);
                sparseIntArray.append(57, 37);
                sparseIntArray.append(59, 38);
                sparseIntArray.append(63, 39);
                sparseIntArray.append(72, 40);
                sparseIntArray.append(66, 41);
                sparseIntArray.append(44, 42);
                sparseIntArray.append(42, 43);
                sparseIntArray.append(71, 51);
            }
        }

        public C0087a(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x013b, code lost:
            android.util.Log.e("ConstraintLayout", r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0087a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f490a = r0
                r9.f492b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f494c = r1
                r9.f496d = r0
                r9.f498e = r0
                r9.f500f = r0
                r9.f502g = r0
                r9.f504h = r0
                r9.f506i = r0
                r9.f508j = r0
                r9.f510k = r0
                r9.f512l = r0
                r9.f514m = r0
                r2 = 0
                r9.f515n = r2
                r3 = 0
                r9.f516o = r3
                r9.f517p = r0
                r9.f518q = r0
                r9.f519r = r0
                r9.f520s = r0
                r9.f521t = r0
                r9.f522u = r0
                r9.f523v = r0
                r9.f524w = r0
                r9.f525x = r0
                r9.f526y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r9.f527z = r4
                r9.f464A = r4
                r5 = 0
                r9.f465B = r5
                r6 = 1
                r9.f466C = r6
                r9.f467D = r1
                r9.f468E = r1
                r9.f469F = r2
                r9.f470G = r2
                r9.f471H = r2
                r9.f472I = r2
                r9.f473J = r2
                r9.f474K = r2
                r9.f475L = r2
                r9.f476M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.f477N = r1
                r9.f478O = r1
                r9.f479P = r0
                r9.f480Q = r0
                r9.f481R = r0
                r9.f482S = r2
                r9.f483T = r2
                r9.f484U = r5
                r9.f485V = r6
                r9.f486W = r6
                r9.f487X = r2
                r9.f488Y = r2
                r9.f489Z = r2
                r9.f491a0 = r2
                r9.f493b0 = r0
                r9.f495c0 = r0
                r9.f497d0 = r0
                r9.f499e0 = r0
                r9.f501f0 = r0
                r9.f503g0 = r0
                r9.f505h0 = r4
                b.i.b.h.d r1 = new b.i.b.h.d
                r1.<init>()
                r9.f513l0 = r1
                int[] r1 = p009b.p077i.p083c.C1332i.f4225b
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = r2
            L_0x0098:
                if (r1 >= r11) goto L_0x03be
                int r4 = r10.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.C0087a.C0088a.f528a
                int r5 = r5.get(r4)
                r7 = 2
                r8 = -2
                switch(r5) {
                    case 1: goto L_0x02e0;
                    case 2: goto L_0x02ce;
                    case 3: goto L_0x02c4;
                    case 4: goto L_0x02ae;
                    case 5: goto L_0x02a4;
                    case 6: goto L_0x029a;
                    case 7: goto L_0x0290;
                    case 8: goto L_0x027e;
                    case 9: goto L_0x026c;
                    case 10: goto L_0x025a;
                    case 11: goto L_0x0248;
                    case 12: goto L_0x0236;
                    case 13: goto L_0x0224;
                    case 14: goto L_0x0212;
                    case 15: goto L_0x0200;
                    case 16: goto L_0x01ee;
                    case 17: goto L_0x01dc;
                    case 18: goto L_0x01ca;
                    case 19: goto L_0x01b8;
                    case 20: goto L_0x01a6;
                    case 21: goto L_0x019c;
                    case 22: goto L_0x0192;
                    case 23: goto L_0x0188;
                    case 24: goto L_0x017e;
                    case 25: goto L_0x0174;
                    case 26: goto L_0x016a;
                    case 27: goto L_0x0160;
                    case 28: goto L_0x0156;
                    case 29: goto L_0x014c;
                    case 30: goto L_0x0142;
                    case 31: goto L_0x0131;
                    case 32: goto L_0x0126;
                    case 33: goto L_0x0110;
                    case 34: goto L_0x00fa;
                    case 35: goto L_0x00ea;
                    case 36: goto L_0x00d4;
                    case 37: goto L_0x00be;
                    case 38: goto L_0x00ae;
                    default: goto L_0x00a9;
                }
            L_0x00a9:
                switch(r5) {
                    case 44: goto L_0x032a;
                    case 45: goto L_0x0320;
                    case 46: goto L_0x0316;
                    case 47: goto L_0x030e;
                    case 48: goto L_0x0306;
                    case 49: goto L_0x02fc;
                    case 50: goto L_0x02f2;
                    case 51: goto L_0x02ea;
                    default: goto L_0x00ac;
                }
            L_0x00ac:
                goto L_0x03ba
            L_0x00ae:
                float r5 = r9.f478O
                float r4 = r10.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r9.f478O = r4
                r9.f472I = r7
                goto L_0x03ba
            L_0x00be:
                int r5 = r9.f476M     // Catch:{ Exception -> 0x00c8 }
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x00c8 }
                r9.f476M = r5     // Catch:{ Exception -> 0x00c8 }
                goto L_0x03ba
            L_0x00c8:
                int r5 = r9.f476M
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L_0x03ba
                r9.f476M = r8
                goto L_0x03ba
            L_0x00d4:
                int r5 = r9.f474K     // Catch:{ Exception -> 0x00de }
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x00de }
                r9.f474K = r5     // Catch:{ Exception -> 0x00de }
                goto L_0x03ba
            L_0x00de:
                int r5 = r9.f474K
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L_0x03ba
                r9.f474K = r8
                goto L_0x03ba
            L_0x00ea:
                float r5 = r9.f477N
                float r4 = r10.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r9.f477N = r4
                r9.f471H = r7
                goto L_0x03ba
            L_0x00fa:
                int r5 = r9.f475L     // Catch:{ Exception -> 0x0104 }
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x0104 }
                r9.f475L = r5     // Catch:{ Exception -> 0x0104 }
                goto L_0x03ba
            L_0x0104:
                int r5 = r9.f475L
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L_0x03ba
                r9.f475L = r8
                goto L_0x03ba
            L_0x0110:
                int r5 = r9.f473J     // Catch:{ Exception -> 0x011a }
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x011a }
                r9.f473J = r5     // Catch:{ Exception -> 0x011a }
                goto L_0x03ba
            L_0x011a:
                int r5 = r9.f473J
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L_0x03ba
                r9.f473J = r8
                goto L_0x03ba
            L_0x0126:
                int r4 = r10.getInt(r4, r2)
                r9.f472I = r4
                if (r4 != r6) goto L_0x03ba
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x013b
            L_0x0131:
                int r4 = r10.getInt(r4, r2)
                r9.f471H = r4
                if (r4 != r6) goto L_0x03ba
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x013b:
                java.lang.String r5 = "ConstraintLayout"
                android.util.Log.e(r5, r4)
                goto L_0x03ba
            L_0x0142:
                float r5 = r9.f464A
                float r4 = r10.getFloat(r4, r5)
                r9.f464A = r4
                goto L_0x03ba
            L_0x014c:
                float r5 = r9.f527z
                float r4 = r10.getFloat(r4, r5)
                r9.f527z = r4
                goto L_0x03ba
            L_0x0156:
                boolean r5 = r9.f483T
                boolean r4 = r10.getBoolean(r4, r5)
                r9.f483T = r4
                goto L_0x03ba
            L_0x0160:
                boolean r5 = r9.f482S
                boolean r4 = r10.getBoolean(r4, r5)
                r9.f482S = r4
                goto L_0x03ba
            L_0x016a:
                int r5 = r9.f526y
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f526y = r4
                goto L_0x03ba
            L_0x0174:
                int r5 = r9.f525x
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f525x = r4
                goto L_0x03ba
            L_0x017e:
                int r5 = r9.f524w
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f524w = r4
                goto L_0x03ba
            L_0x0188:
                int r5 = r9.f523v
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f523v = r4
                goto L_0x03ba
            L_0x0192:
                int r5 = r9.f522u
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f522u = r4
                goto L_0x03ba
            L_0x019c:
                int r5 = r9.f521t
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f521t = r4
                goto L_0x03ba
            L_0x01a6:
                int r5 = r9.f520s
                int r5 = r10.getResourceId(r4, r5)
                r9.f520s = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f520s = r4
                goto L_0x03ba
            L_0x01b8:
                int r5 = r9.f519r
                int r5 = r10.getResourceId(r4, r5)
                r9.f519r = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f519r = r4
                goto L_0x03ba
            L_0x01ca:
                int r5 = r9.f518q
                int r5 = r10.getResourceId(r4, r5)
                r9.f518q = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f518q = r4
                goto L_0x03ba
            L_0x01dc:
                int r5 = r9.f517p
                int r5 = r10.getResourceId(r4, r5)
                r9.f517p = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f517p = r4
                goto L_0x03ba
            L_0x01ee:
                int r5 = r9.f512l
                int r5 = r10.getResourceId(r4, r5)
                r9.f512l = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f512l = r4
                goto L_0x03ba
            L_0x0200:
                int r5 = r9.f510k
                int r5 = r10.getResourceId(r4, r5)
                r9.f510k = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f510k = r4
                goto L_0x03ba
            L_0x0212:
                int r5 = r9.f508j
                int r5 = r10.getResourceId(r4, r5)
                r9.f508j = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f508j = r4
                goto L_0x03ba
            L_0x0224:
                int r5 = r9.f506i
                int r5 = r10.getResourceId(r4, r5)
                r9.f506i = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f506i = r4
                goto L_0x03ba
            L_0x0236:
                int r5 = r9.f504h
                int r5 = r10.getResourceId(r4, r5)
                r9.f504h = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f504h = r4
                goto L_0x03ba
            L_0x0248:
                int r5 = r9.f502g
                int r5 = r10.getResourceId(r4, r5)
                r9.f502g = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f502g = r4
                goto L_0x03ba
            L_0x025a:
                int r5 = r9.f500f
                int r5 = r10.getResourceId(r4, r5)
                r9.f500f = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f500f = r4
                goto L_0x03ba
            L_0x026c:
                int r5 = r9.f498e
                int r5 = r10.getResourceId(r4, r5)
                r9.f498e = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f498e = r4
                goto L_0x03ba
            L_0x027e:
                int r5 = r9.f496d
                int r5 = r10.getResourceId(r4, r5)
                r9.f496d = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f496d = r4
                goto L_0x03ba
            L_0x0290:
                float r5 = r9.f494c
                float r4 = r10.getFloat(r4, r5)
                r9.f494c = r4
                goto L_0x03ba
            L_0x029a:
                int r5 = r9.f492b
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.f492b = r4
                goto L_0x03ba
            L_0x02a4:
                int r5 = r9.f490a
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.f490a = r4
                goto L_0x03ba
            L_0x02ae:
                float r5 = r9.f516o
                float r4 = r10.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r9.f516o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03ba
                float r4 = r5 - r4
                float r4 = r4 % r5
                r9.f516o = r4
                goto L_0x03ba
            L_0x02c4:
                int r5 = r9.f515n
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f515n = r4
                goto L_0x03ba
            L_0x02ce:
                int r5 = r9.f514m
                int r5 = r10.getResourceId(r4, r5)
                r9.f514m = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f514m = r4
                goto L_0x03ba
            L_0x02e0:
                int r5 = r9.f481R
                int r4 = r10.getInt(r4, r5)
                r9.f481R = r4
                goto L_0x03ba
            L_0x02ea:
                java.lang.String r4 = r10.getString(r4)
                r9.f484U = r4
                goto L_0x03ba
            L_0x02f2:
                int r5 = r9.f480Q
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.f480Q = r4
                goto L_0x03ba
            L_0x02fc:
                int r5 = r9.f479P
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.f479P = r4
                goto L_0x03ba
            L_0x0306:
                int r4 = r10.getInt(r4, r2)
                r9.f470G = r4
                goto L_0x03ba
            L_0x030e:
                int r4 = r10.getInt(r4, r2)
                r9.f469F = r4
                goto L_0x03ba
            L_0x0316:
                float r5 = r9.f468E
                float r4 = r10.getFloat(r4, r5)
                r9.f468E = r4
                goto L_0x03ba
            L_0x0320:
                float r5 = r9.f467D
                float r4 = r10.getFloat(r4, r5)
                r9.f467D = r4
                goto L_0x03ba
            L_0x032a:
                java.lang.String r4 = r10.getString(r4)
                r9.f465B = r4
                r9.f466C = r0
                if (r4 == 0) goto L_0x03ba
                int r4 = r4.length()
                java.lang.String r5 = r9.f465B
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L_0x0364
                int r7 = r4 + -1
                if (r5 >= r7) goto L_0x0364
                java.lang.String r7 = r9.f465B
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0357
                r9.f466C = r2
                goto L_0x0361
            L_0x0357:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x0361
                r9.f466C = r6
            L_0x0361:
                int r5 = r5 + 1
                goto L_0x0365
            L_0x0364:
                r5 = r2
            L_0x0365:
                java.lang.String r7 = r9.f465B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x03ab
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x03ab
                java.lang.String r4 = r9.f465B
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r9.f465B
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03ba
                int r7 = r5.length()
                if (r7 <= 0) goto L_0x03ba
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03ba }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03ba
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03ba
                int r7 = r9.f466C     // Catch:{ NumberFormatException -> 0x03ba }
                if (r7 != r6) goto L_0x03a6
                float r5 = r5 / r4
                java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x03a6:
                float r4 = r4 / r5
                java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x03ab:
                java.lang.String r4 = r9.f465B
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L_0x03ba
                java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03ba }
            L_0x03ba:
                int r1 = r1 + 1
                goto L_0x0098
            L_0x03be:
                r10.recycle()
                r9.mo627a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0087a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0087a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo627a() {
            this.f488Y = false;
            this.f485V = true;
            this.f486W = true;
            int i = this.width;
            if (i == -2 && this.f482S) {
                this.f485V = false;
                if (this.f471H == 0) {
                    this.f471H = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f483T) {
                this.f486W = false;
                if (this.f472I == 0) {
                    this.f472I = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f485V = false;
                if (i == 0 && this.f471H == 1) {
                    this.width = -2;
                    this.f482S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f486W = false;
                if (i2 == 0 && this.f472I == 1) {
                    this.height = -2;
                    this.f483T = true;
                }
            }
            if (this.f494c != -1.0f || this.f490a != -1 || this.f492b != -1) {
                this.f488Y = true;
                this.f485V = true;
                this.f486W = true;
                if (!(this.f513l0 instanceof C1289f)) {
                    this.f513l0 = new C1289f();
                }
                ((C1289f) this.f513l0).mo3953Q(this.f481R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ce, code lost:
            if (r1 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00dd, code lost:
            if (r1 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00ef  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L_0x0011
                r10 = r3
                goto L_0x0012
            L_0x0011:
                r10 = r2
            L_0x0012:
                r4 = -1
                r9.f497d0 = r4
                r9.f499e0 = r4
                r9.f493b0 = r4
                r9.f495c0 = r4
                r9.f501f0 = r4
                r9.f503g0 = r4
                int r5 = r9.f521t
                r9.f501f0 = r5
                int r5 = r9.f523v
                r9.f503g0 = r5
                float r5 = r9.f527z
                r9.f505h0 = r5
                int r6 = r9.f490a
                r9.f507i0 = r6
                int r7 = r9.f492b
                r9.f509j0 = r7
                float r8 = r9.f494c
                r9.f511k0 = r8
                if (r10 == 0) goto L_0x0090
                int r10 = r9.f517p
                if (r10 == r4) goto L_0x0041
                r9.f497d0 = r10
            L_0x003f:
                r2 = r3
                goto L_0x0048
            L_0x0041:
                int r10 = r9.f518q
                if (r10 == r4) goto L_0x0048
                r9.f499e0 = r10
                goto L_0x003f
            L_0x0048:
                int r10 = r9.f519r
                if (r10 == r4) goto L_0x004f
                r9.f495c0 = r10
                r2 = r3
            L_0x004f:
                int r10 = r9.f520s
                if (r10 == r4) goto L_0x0056
                r9.f493b0 = r10
                r2 = r3
            L_0x0056:
                int r10 = r9.f525x
                if (r10 == r4) goto L_0x005c
                r9.f503g0 = r10
            L_0x005c:
                int r10 = r9.f526y
                if (r10 == r4) goto L_0x0062
                r9.f501f0 = r10
            L_0x0062:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x006a
                float r2 = r10 - r5
                r9.f505h0 = r2
            L_0x006a:
                boolean r2 = r9.f488Y
                if (r2 == 0) goto L_0x00b4
                int r2 = r9.f481R
                if (r2 != r3) goto L_0x00b4
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0080
                float r10 = r10 - r8
                r9.f511k0 = r10
                r9.f507i0 = r4
                r9.f509j0 = r4
                goto L_0x00b4
            L_0x0080:
                if (r6 == r4) goto L_0x0089
                r9.f509j0 = r6
                r9.f507i0 = r4
            L_0x0086:
                r9.f511k0 = r2
                goto L_0x00b4
            L_0x0089:
                if (r7 == r4) goto L_0x00b4
                r9.f507i0 = r7
                r9.f509j0 = r4
                goto L_0x0086
            L_0x0090:
                int r10 = r9.f517p
                if (r10 == r4) goto L_0x0096
                r9.f495c0 = r10
            L_0x0096:
                int r10 = r9.f518q
                if (r10 == r4) goto L_0x009c
                r9.f493b0 = r10
            L_0x009c:
                int r10 = r9.f519r
                if (r10 == r4) goto L_0x00a2
                r9.f497d0 = r10
            L_0x00a2:
                int r10 = r9.f520s
                if (r10 == r4) goto L_0x00a8
                r9.f499e0 = r10
            L_0x00a8:
                int r10 = r9.f525x
                if (r10 == r4) goto L_0x00ae
                r9.f501f0 = r10
            L_0x00ae:
                int r10 = r9.f526y
                if (r10 == r4) goto L_0x00b4
                r9.f503g0 = r10
            L_0x00b4:
                int r10 = r9.f519r
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.f520s
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.f518q
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.f517p
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.f500f
                if (r10 == r4) goto L_0x00d3
                r9.f497d0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00e0
                if (r1 <= 0) goto L_0x00e0
            L_0x00d0:
                r9.rightMargin = r1
                goto L_0x00e0
            L_0x00d3:
                int r10 = r9.f502g
                if (r10 == r4) goto L_0x00e0
                r9.f499e0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00e0
                if (r1 <= 0) goto L_0x00e0
                goto L_0x00d0
            L_0x00e0:
                int r10 = r9.f496d
                if (r10 == r4) goto L_0x00ef
                r9.f493b0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00fc
                if (r0 <= 0) goto L_0x00fc
            L_0x00ec:
                r9.leftMargin = r0
                goto L_0x00fc
            L_0x00ef:
                int r10 = r9.f498e
                if (r10 == r4) goto L_0x00fc
                r9.f495c0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00fc
                if (r0 <= 0) goto L_0x00fc
                goto L_0x00ec
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0087a.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C0089b implements C1296b.C1298b {

        /* renamed from: a */
        public ConstraintLayout f529a;

        /* renamed from: b */
        public int f530b;

        /* renamed from: c */
        public int f531c;

        /* renamed from: d */
        public int f532d;

        /* renamed from: e */
        public int f533e;

        /* renamed from: f */
        public int f534f;

        /* renamed from: g */
        public int f535g;

        public C0089b(ConstraintLayout constraintLayout) {
            this.f529a = constraintLayout;
        }

        /* renamed from: a */
        public final boolean mo629a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:116:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x01c2  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x01c7 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x01cf A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x01de  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x01e0  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01e9  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x01eb  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x01ee A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x01ef  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x013a  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo630b(p009b.p077i.p080b.p081h.C1286d r18, p009b.p077i.p080b.p081h.p082l.C1296b.C1297a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                b.i.b.h.d$a r3 = p009b.p077i.p080b.p081h.C1286d.C1287a.FIXED
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                int r4 = r1.f3933c0
                r5 = 8
                r6 = 0
                if (r4 != r5) goto L_0x001d
                boolean r4 = r1.f3964z
                if (r4 != 0) goto L_0x001d
                r2.f4006e = r6
                r2.f4007f = r6
                r2.f4008g = r6
                return
            L_0x001d:
                b.i.b.h.d r4 = r1.f3917P
                if (r4 != 0) goto L_0x0022
                return
            L_0x0022:
                b.i.b.h.d$a r4 = r2.f4002a
                b.i.b.h.d$a r5 = r2.f4003b
                int r7 = r2.f4004c
                int r8 = r2.f4005d
                int r9 = r0.f530b
                int r10 = r0.f531c
                int r9 = r9 + r10
                int r10 = r0.f532d
                java.lang.Object r11 = r1.f3931b0
                android.view.View r11 = (android.view.View) r11
                int r12 = r4.ordinal()
                r13 = 3
                r14 = 2
                r15 = 1
                if (r12 == 0) goto L_0x00b4
                if (r12 == r15) goto L_0x00aa
                if (r12 == r14) goto L_0x0060
                if (r12 == r13) goto L_0x0046
                goto L_0x00ba
            L_0x0046:
                int r7 = r0.f534f
                b.i.b.h.c r12 = r1.f3905D
                if (r12 == 0) goto L_0x0050
                int r12 = r12.f3889g
                int r12 = r12 + r6
                goto L_0x0051
            L_0x0050:
                r12 = r6
            L_0x0051:
                b.i.b.h.c r6 = r1.f3907F
                if (r6 == 0) goto L_0x0058
                int r6 = r6.f3889g
                int r12 = r12 + r6
            L_0x0058:
                int r10 = r10 + r12
                r6 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r6)
                goto L_0x00bb
            L_0x0060:
                int r6 = r0.f534f
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r10, r7)
                int r7 = r1.f3950l
                if (r7 != r15) goto L_0x006d
                r7 = r15
                goto L_0x006e
            L_0x006d:
                r7 = 0
            L_0x006e:
                int r10 = r2.f4011j
                if (r10 == r15) goto L_0x0078
                if (r10 != r14) goto L_0x0075
                goto L_0x0078
            L_0x0075:
                r12 = 1073741824(0x40000000, float:2.0)
                goto L_0x00ba
            L_0x0078:
                int r10 = r11.getMeasuredHeight()
                int r12 = r18.mo3928l()
                if (r10 != r12) goto L_0x0084
                r10 = r15
                goto L_0x0085
            L_0x0084:
                r10 = 0
            L_0x0085:
                int r12 = r2.f4011j
                if (r12 == r14) goto L_0x009c
                if (r7 == 0) goto L_0x009c
                if (r7 == 0) goto L_0x008f
                if (r10 != 0) goto L_0x009c
            L_0x008f:
                boolean r7 = r11 instanceof p009b.p077i.p083c.C1330g
                if (r7 != 0) goto L_0x009c
                boolean r7 = r18.mo3894z()
                if (r7 == 0) goto L_0x009a
                goto L_0x009c
            L_0x009a:
                r7 = 0
                goto L_0x009d
            L_0x009c:
                r7 = r15
            L_0x009d:
                if (r7 == 0) goto L_0x0075
                int r6 = r18.mo3934r()
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r12)
                goto L_0x00ba
            L_0x00aa:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f534f
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r10, r7)
                goto L_0x00ba
            L_0x00b4:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            L_0x00ba:
                r7 = r6
            L_0x00bb:
                int r6 = r5.ordinal()
                if (r6 == 0) goto L_0x013a
                if (r6 == r15) goto L_0x0130
                if (r6 == r14) goto L_0x00e6
                if (r6 == r13) goto L_0x00ca
                r10 = 0
                goto L_0x0141
            L_0x00ca:
                int r6 = r0.f535g
                b.i.b.h.c r8 = r1.f3905D
                if (r8 == 0) goto L_0x00d7
                b.i.b.h.c r8 = r1.f3906E
                int r8 = r8.f3889g
                r10 = 0
                int r8 = r8 + r10
                goto L_0x00d8
            L_0x00d7:
                r8 = 0
            L_0x00d8:
                b.i.b.h.c r10 = r1.f3907F
                if (r10 == 0) goto L_0x00e1
                b.i.b.h.c r10 = r1.f3908G
                int r10 = r10.f3889g
                int r8 = r8 + r10
            L_0x00e1:
                int r9 = r9 + r8
                r8 = -1
                r10 = 1073741824(0x40000000, float:2.0)
                goto L_0x0135
            L_0x00e6:
                int r6 = r0.f535g
                r8 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r8)
                int r8 = r1.f3951m
                if (r8 != r15) goto L_0x00f3
                r8 = r15
                goto L_0x00f4
            L_0x00f3:
                r8 = 0
            L_0x00f4:
                int r9 = r2.f4011j
                if (r9 == r15) goto L_0x00fe
                if (r9 != r14) goto L_0x00fb
                goto L_0x00fe
            L_0x00fb:
                r10 = 1073741824(0x40000000, float:2.0)
                goto L_0x0140
            L_0x00fe:
                int r9 = r11.getMeasuredWidth()
                int r10 = r18.mo3934r()
                if (r9 != r10) goto L_0x010a
                r9 = r15
                goto L_0x010b
            L_0x010a:
                r9 = 0
            L_0x010b:
                int r10 = r2.f4011j
                if (r10 == r14) goto L_0x0122
                if (r8 == 0) goto L_0x0122
                if (r8 == 0) goto L_0x0115
                if (r9 != 0) goto L_0x0122
            L_0x0115:
                boolean r8 = r11 instanceof p009b.p077i.p083c.C1330g
                if (r8 != 0) goto L_0x0122
                boolean r8 = r18.mo3888A()
                if (r8 == 0) goto L_0x0120
                goto L_0x0122
            L_0x0120:
                r8 = 0
                goto L_0x0123
            L_0x0122:
                r8 = r15
            L_0x0123:
                if (r8 == 0) goto L_0x00fb
                int r6 = r18.mo3928l()
                r10 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r10)
                goto L_0x0140
            L_0x0130:
                r8 = -2
                r10 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f535g
            L_0x0135:
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r8)
                goto L_0x0140
            L_0x013a:
                r10 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            L_0x0140:
                r10 = r6
            L_0x0141:
                b.i.b.h.d r6 = r1.f3917P
                b.i.b.h.e r6 = (p009b.p077i.p080b.p081h.C1288e) r6
                if (r6 == 0) goto L_0x01b7
                androidx.constraintlayout.widget.ConstraintLayout r8 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r8 = r8.f453k
                r9 = 256(0x100, float:3.59E-43)
                boolean r8 = p009b.p077i.p080b.p081h.C1292i.m3170b(r8, r9)
                if (r8 == 0) goto L_0x01b7
                int r8 = r11.getMeasuredWidth()
                int r9 = r18.mo3934r()
                if (r8 != r9) goto L_0x01b7
                int r8 = r11.getMeasuredWidth()
                int r9 = r6.mo3934r()
                if (r8 >= r9) goto L_0x01b7
                int r8 = r11.getMeasuredHeight()
                int r9 = r18.mo3928l()
                if (r8 != r9) goto L_0x01b7
                int r8 = r11.getMeasuredHeight()
                int r6 = r6.mo3928l()
                if (r8 >= r6) goto L_0x01b7
                int r6 = r11.getBaseline()
                int r8 = r1.f3924W
                if (r6 != r8) goto L_0x01b7
                boolean r6 = r18.mo3941y()
                if (r6 != 0) goto L_0x01b7
                int r6 = r1.f3903B
                int r8 = r18.mo3934r()
                boolean r6 = r0.mo629a(r6, r7, r8)
                if (r6 == 0) goto L_0x01a3
                int r6 = r1.f3904C
                int r8 = r18.mo3928l()
                boolean r6 = r0.mo629a(r6, r10, r8)
                if (r6 == 0) goto L_0x01a3
                r6 = r15
                goto L_0x01a4
            L_0x01a3:
                r6 = 0
            L_0x01a4:
                if (r6 == 0) goto L_0x01b7
                int r3 = r18.mo3934r()
                r2.f4006e = r3
                int r3 = r18.mo3928l()
                r2.f4007f = r3
                int r1 = r1.f3924W
                r2.f4008g = r1
                return
            L_0x01b7:
                b.i.b.h.d$a r6 = p009b.p077i.p080b.p081h.C1286d.C1287a.MATCH_CONSTRAINT
                if (r4 != r6) goto L_0x01bd
                r8 = r15
                goto L_0x01be
            L_0x01bd:
                r8 = 0
            L_0x01be:
                if (r5 != r6) goto L_0x01c2
                r6 = r15
                goto L_0x01c3
            L_0x01c2:
                r6 = 0
            L_0x01c3:
                b.i.b.h.d$a r9 = p009b.p077i.p080b.p081h.C1286d.C1287a.MATCH_PARENT
                if (r5 == r9) goto L_0x01cc
                if (r5 != r3) goto L_0x01ca
                goto L_0x01cc
            L_0x01ca:
                r5 = 0
                goto L_0x01cd
            L_0x01cc:
                r5 = r15
            L_0x01cd:
                if (r4 == r9) goto L_0x01d4
                if (r4 != r3) goto L_0x01d2
                goto L_0x01d4
            L_0x01d2:
                r3 = 0
                goto L_0x01d5
            L_0x01d4:
                r3 = r15
            L_0x01d5:
                r4 = 0
                if (r8 == 0) goto L_0x01e0
                float r9 = r1.f3920S
                int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r9 <= 0) goto L_0x01e0
                r9 = r15
                goto L_0x01e1
            L_0x01e0:
                r9 = 0
            L_0x01e1:
                if (r6 == 0) goto L_0x01eb
                float r12 = r1.f3920S
                int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x01eb
                r4 = r15
                goto L_0x01ec
            L_0x01eb:
                r4 = 0
            L_0x01ec:
                if (r11 != 0) goto L_0x01ef
                return
            L_0x01ef:
                android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$a r12 = (androidx.constraintlayout.widget.ConstraintLayout.C0087a) r12
                int r13 = r2.f4011j
                if (r13 == r15) goto L_0x020f
                if (r13 == r14) goto L_0x020f
                if (r8 == 0) goto L_0x020f
                int r8 = r1.f3950l
                if (r8 != 0) goto L_0x020f
                if (r6 == 0) goto L_0x020f
                int r6 = r1.f3951m
                if (r6 == 0) goto L_0x0208
                goto L_0x020f
            L_0x0208:
                r0 = -1
                r10 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                goto L_0x02b6
            L_0x020f:
                boolean r6 = r11 instanceof p009b.p077i.p083c.C1333j
                if (r6 == 0) goto L_0x0221
                boolean r6 = r1 instanceof p009b.p077i.p080b.p081h.C1293j
                if (r6 == 0) goto L_0x0221
                r6 = r1
                b.i.b.h.j r6 = (p009b.p077i.p080b.p081h.C1293j) r6
                r6 = r11
                b.i.c.j r6 = (p009b.p077i.p083c.C1333j) r6
                r6.mo4041l()
                goto L_0x0224
            L_0x0221:
                r11.measure(r7, r10)
            L_0x0224:
                r1.f3903B = r7
                r1.f3904C = r10
                r6 = 0
                r1.f3940g = r6
                int r6 = r11.getMeasuredWidth()
                int r8 = r11.getMeasuredHeight()
                int r13 = r11.getBaseline()
                int r14 = r1.f3953o
                if (r14 <= 0) goto L_0x0240
                int r14 = java.lang.Math.max(r14, r6)
                goto L_0x0241
            L_0x0240:
                r14 = r6
            L_0x0241:
                int r15 = r1.f3954p
                if (r15 <= 0) goto L_0x0249
                int r14 = java.lang.Math.min(r15, r14)
            L_0x0249:
                int r15 = r1.f3956r
                if (r15 <= 0) goto L_0x0254
                int r15 = java.lang.Math.max(r15, r8)
                r16 = r7
                goto L_0x0257
            L_0x0254:
                r16 = r7
                r15 = r8
            L_0x0257:
                int r7 = r1.f3957s
                if (r7 <= 0) goto L_0x025f
                int r15 = java.lang.Math.min(r7, r15)
            L_0x025f:
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.f453k
                r0 = 1
                boolean r7 = p009b.p077i.p080b.p081h.C1292i.m3170b(r7, r0)
                if (r7 != 0) goto L_0x0283
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r9 == 0) goto L_0x0278
                if (r5 == 0) goto L_0x0278
                float r3 = r1.f3920S
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r14 = r0
                goto L_0x0283
            L_0x0278:
                if (r4 == 0) goto L_0x0283
                if (r3 == 0) goto L_0x0283
                float r3 = r1.f3920S
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
            L_0x0283:
                if (r6 != r14) goto L_0x028b
                if (r8 == r15) goto L_0x0288
                goto L_0x028b
            L_0x0288:
                r0 = -1
                r10 = 0
                goto L_0x02b6
            L_0x028b:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r6 == r14) goto L_0x0294
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
                goto L_0x0296
            L_0x0294:
                r7 = r16
            L_0x0296:
                if (r8 == r15) goto L_0x029c
                int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            L_0x029c:
                r11.measure(r7, r10)
                r1.f3903B = r7
                r1.f3904C = r10
                r10 = 0
                r1.f3940g = r10
                int r0 = r11.getMeasuredWidth()
                int r3 = r11.getMeasuredHeight()
                int r4 = r11.getBaseline()
                r14 = r0
                r15 = r3
                r13 = r4
                r0 = -1
            L_0x02b6:
                if (r13 == r0) goto L_0x02ba
                r0 = 1
                goto L_0x02bb
            L_0x02ba:
                r0 = r10
            L_0x02bb:
                int r3 = r2.f4004c
                if (r14 != r3) goto L_0x02c6
                int r3 = r2.f4005d
                if (r15 == r3) goto L_0x02c4
                goto L_0x02c6
            L_0x02c4:
                r6 = r10
                goto L_0x02c7
            L_0x02c6:
                r6 = 1
            L_0x02c7:
                r2.f4010i = r6
                boolean r3 = r12.f487X
                if (r3 == 0) goto L_0x02ce
                r0 = 1
            L_0x02ce:
                if (r0 == 0) goto L_0x02da
                r3 = -1
                if (r13 == r3) goto L_0x02da
                int r1 = r1.f3924W
                if (r1 == r13) goto L_0x02da
                r1 = 1
                r2.f4010i = r1
            L_0x02da:
                r2.f4006e = r14
                r2.f4007f = r15
                r2.f4009h = r0
                r2.f4008g = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0089b.mo630b(b.i.b.h.d, b.i.b.h.l.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo598f(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo598f(attributeSet, i, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public C0087a generateDefaultLayoutParams() {
        return new C0087a(-2, -2);
    }

    /* renamed from: c */
    public Object mo593c(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f457o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f457o.get(str);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0087a;
    }

    /* renamed from: d */
    public View mo595d(int i) {
        return this.f445c.get(i);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<C1317b> arrayList = this.f446d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f446d.get(i).mo4007j();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final C1286d mo597e(View view) {
        if (view == this) {
            return this.f447e;
        }
        if (view == null) {
            return null;
        }
        return ((C0087a) view.getLayoutParams()).f513l0;
    }

    /* renamed from: f */
    public final void mo598f(AttributeSet attributeSet, int i, int i2) {
        C1288e eVar = this.f447e;
        eVar.f3931b0 = this;
        C0089b bVar = this.f461s;
        eVar.f3977o0 = bVar;
        eVar.f3976n0.f4019f = bVar;
        this.f445c.put(getId(), this);
        this.f454l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1332i.f4225b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.f448f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f448f);
                } else if (index == 10) {
                    this.f449g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f449g);
                } else if (index == 7) {
                    this.f450h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f450h);
                } else if (index == 8) {
                    this.f451i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f451i);
                } else if (index == 90) {
                    this.f453k = obtainStyledAttributes.getInt(index, this.f453k);
                } else if (index == 39) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f455m = new C1318c(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f455m = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1321d dVar = new C1321d();
                        this.f454l = dVar;
                        dVar.mo4021e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f454l = null;
                    }
                    this.f456n = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f447e.mo3951Z(this.f453k);
    }

    public void forceLayout() {
        this.f452j = true;
        this.f458p = -1;
        this.f459q = -1;
        super.forceLayout();
    }

    /* renamed from: g */
    public boolean mo600g() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0087a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0087a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f451i;
    }

    public int getMaxWidth() {
        return this.f450h;
    }

    public int getMinHeight() {
        return this.f449g;
    }

    public int getMinWidth() {
        return this.f448f;
    }

    public int getOptimizationLevel() {
        return this.f447e.f3986x0;
    }

    /* renamed from: h */
    public void mo609h(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0089b bVar = this.f461s;
        int i5 = bVar.f533e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + bVar.f532d, i, 0);
        int min = Math.min(this.f450h, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f451i, ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f458p = min;
        this.f459q = min2;
    }

    /* renamed from: i */
    public void mo610i(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f457o == null) {
                this.f457o = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f457o.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x030c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0523  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo611j() {
        /*
            r26 = this;
            r0 = r26
            int r1 = r26.getChildCount()
            r2 = 0
            r3 = r2
        L_0x0008:
            r4 = 1
            if (r3 >= r1) goto L_0x001a
            android.view.View r5 = r0.getChildAt(r3)
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L_0x0017
            r1 = r4
            goto L_0x001b
        L_0x0017:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x001a:
            r1 = r2
        L_0x001b:
            if (r1 == 0) goto L_0x0595
            boolean r3 = r26.isInEditMode()
            int r5 = r26.getChildCount()
            r6 = r2
        L_0x0026:
            if (r6 >= r5) goto L_0x0039
            android.view.View r7 = r0.getChildAt(r6)
            b.i.b.h.d r7 = r0.mo597e(r7)
            if (r7 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r7.mo3906B()
        L_0x0036:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0039:
            r6 = 0
            r7 = -1
            if (r3 == 0) goto L_0x00a1
            r8 = r2
        L_0x003e:
            if (r8 >= r5) goto L_0x00a1
            android.view.View r9 = r0.getChildAt(r8)
            android.content.res.Resources r10 = r26.getResources()     // Catch:{ NotFoundException -> 0x009e }
            int r11 = r9.getId()     // Catch:{ NotFoundException -> 0x009e }
            java.lang.String r10 = r10.getResourceName(r11)     // Catch:{ NotFoundException -> 0x009e }
            int r11 = r9.getId()     // Catch:{ NotFoundException -> 0x009e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NotFoundException -> 0x009e }
            r0.mo610i(r2, r10, r11)     // Catch:{ NotFoundException -> 0x009e }
            r11 = 47
            int r11 = r10.indexOf(r11)     // Catch:{ NotFoundException -> 0x009e }
            if (r11 == r7) goto L_0x0069
            int r11 = r11 + 1
            java.lang.String r10 = r10.substring(r11)     // Catch:{ NotFoundException -> 0x009e }
        L_0x0069:
            int r9 = r9.getId()     // Catch:{ NotFoundException -> 0x009e }
            if (r9 != 0) goto L_0x0070
            goto L_0x008d
        L_0x0070:
            android.util.SparseArray<android.view.View> r11 = r0.f445c     // Catch:{ NotFoundException -> 0x009e }
            java.lang.Object r11 = r11.get(r9)     // Catch:{ NotFoundException -> 0x009e }
            android.view.View r11 = (android.view.View) r11     // Catch:{ NotFoundException -> 0x009e }
            if (r11 != 0) goto L_0x008b
            android.view.View r11 = r0.findViewById(r9)     // Catch:{ NotFoundException -> 0x009e }
            if (r11 == 0) goto L_0x008b
            if (r11 == r0) goto L_0x008b
            android.view.ViewParent r9 = r11.getParent()     // Catch:{ NotFoundException -> 0x009e }
            if (r9 != r0) goto L_0x008b
            r0.onViewAdded(r11)     // Catch:{ NotFoundException -> 0x009e }
        L_0x008b:
            if (r11 != r0) goto L_0x0090
        L_0x008d:
            b.i.b.h.e r9 = r0.f447e     // Catch:{ NotFoundException -> 0x009e }
            goto L_0x009c
        L_0x0090:
            if (r11 != 0) goto L_0x0094
            r9 = r6
            goto L_0x009c
        L_0x0094:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()     // Catch:{ NotFoundException -> 0x009e }
            androidx.constraintlayout.widget.ConstraintLayout$a r9 = (androidx.constraintlayout.widget.ConstraintLayout.C0087a) r9     // Catch:{ NotFoundException -> 0x009e }
            b.i.b.h.d r9 = r9.f513l0     // Catch:{ NotFoundException -> 0x009e }
        L_0x009c:
            r9.f3935d0 = r10     // Catch:{ NotFoundException -> 0x009e }
        L_0x009e:
            int r8 = r8 + 1
            goto L_0x003e
        L_0x00a1:
            int r8 = r0.f456n
            if (r8 == r7) goto L_0x00c3
            r8 = r2
        L_0x00a6:
            if (r8 >= r5) goto L_0x00c3
            android.view.View r9 = r0.getChildAt(r8)
            int r10 = r9.getId()
            int r11 = r0.f456n
            if (r10 != r11) goto L_0x00c0
            boolean r10 = r9 instanceof p009b.p077i.p083c.C1327e
            if (r10 == 0) goto L_0x00c0
            b.i.c.e r9 = (p009b.p077i.p083c.C1327e) r9
            b.i.c.d r9 = r9.getConstraintSet()
            r0.f454l = r9
        L_0x00c0:
            int r8 = r8 + 1
            goto L_0x00a6
        L_0x00c3:
            b.i.c.d r8 = r0.f454l
            if (r8 == 0) goto L_0x00ca
            r8.mo4017a(r0, r4)
        L_0x00ca:
            b.i.b.h.e r8 = r0.f447e
            java.util.ArrayList<b.i.b.h.d> r8 = r8.f3998l0
            r8.clear()
            java.util.ArrayList<b.i.c.b> r8 = r0.f446d
            int r8 = r8.size()
            r9 = 2
            if (r8 <= 0) goto L_0x0170
            r10 = r2
        L_0x00db:
            if (r10 >= r8) goto L_0x0170
            java.util.ArrayList<b.i.c.b> r11 = r0.f446d
            java.lang.Object r11 = r11.get(r10)
            b.i.c.b r11 = (p009b.p077i.p083c.C1317b) r11
            boolean r12 = r11.isInEditMode()
            if (r12 == 0) goto L_0x00f0
            java.lang.String r12 = r11.f4091g
            r11.setIds(r12)
        L_0x00f0:
            b.i.b.h.g r12 = r11.f4090f
            if (r12 != 0) goto L_0x00f6
            goto L_0x016a
        L_0x00f6:
            b.i.b.h.h r12 = (p009b.p077i.p080b.p081h.C1291h) r12
            r12.f3996m0 = r2
            b.i.b.h.d[] r12 = r12.f3995l0
            java.util.Arrays.fill(r12, r6)
            r12 = r2
        L_0x0100:
            int r13 = r11.f4088d
            if (r12 >= r13) goto L_0x0163
            int[] r13 = r11.f4087c
            r13 = r13[r12]
            android.view.View r14 = r0.mo595d(r13)
            if (r14 != 0) goto L_0x0131
            java.util.HashMap<java.lang.Integer, java.lang.String> r15 = r11.f4093i
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r13 = r15.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            int r15 = r11.mo4003e(r0, r13)
            if (r15 == 0) goto L_0x0131
            int[] r14 = r11.f4087c
            r14[r12] = r15
            java.util.HashMap<java.lang.Integer, java.lang.String> r14 = r11.f4093i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r14.put(r6, r13)
            android.view.View r14 = r0.mo595d(r15)
        L_0x0131:
            if (r14 == 0) goto L_0x015e
            b.i.b.h.g r6 = r11.f4090f
            b.i.b.h.d r13 = r0.mo597e(r14)
            b.i.b.h.h r6 = (p009b.p077i.p080b.p081h.C1291h) r6
            java.util.Objects.requireNonNull(r6)
            if (r13 == r6) goto L_0x015e
            if (r13 != 0) goto L_0x0143
            goto L_0x015e
        L_0x0143:
            int r14 = r6.f3996m0
            int r14 = r14 + r4
            b.i.b.h.d[] r15 = r6.f3995l0
            int r2 = r15.length
            if (r14 <= r2) goto L_0x0155
            int r2 = r15.length
            int r2 = r2 * r9
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r15, r2)
            b.i.b.h.d[] r2 = (p009b.p077i.p080b.p081h.C1286d[]) r2
            r6.f3995l0 = r2
        L_0x0155:
            b.i.b.h.d[] r2 = r6.f3995l0
            int r14 = r6.f3996m0
            r2[r14] = r13
            int r14 = r14 + r4
            r6.f3996m0 = r14
        L_0x015e:
            int r12 = r12 + 1
            r2 = 0
            r6 = 0
            goto L_0x0100
        L_0x0163:
            b.i.b.h.g r2 = r11.f4090f
            b.i.b.h.e r6 = r0.f447e
            r2.mo3954a(r6)
        L_0x016a:
            int r10 = r10 + 1
            r2 = 0
            r6 = 0
            goto L_0x00db
        L_0x0170:
            r2 = 0
        L_0x0171:
            if (r2 >= r5) goto L_0x01ac
            android.view.View r6 = r0.getChildAt(r2)
            boolean r8 = r6 instanceof p009b.p077i.p083c.C1330g
            if (r8 == 0) goto L_0x01a8
            b.i.c.g r6 = (p009b.p077i.p083c.C1330g) r6
            int r8 = r6.f4221c
            if (r8 != r7) goto L_0x018c
            boolean r8 = r6.isInEditMode()
            if (r8 != 0) goto L_0x018c
            int r8 = r6.f4223e
            r6.setVisibility(r8)
        L_0x018c:
            int r8 = r6.f4221c
            android.view.View r8 = r0.findViewById(r8)
            r6.f4222d = r8
            if (r8 == 0) goto L_0x01a8
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0087a) r8
            r8.f491a0 = r4
            android.view.View r8 = r6.f4222d
            r10 = 0
            r8.setVisibility(r10)
            r6.setVisibility(r10)
            goto L_0x01a9
        L_0x01a8:
            r10 = 0
        L_0x01a9:
            int r2 = r2 + 1
            goto L_0x0171
        L_0x01ac:
            r10 = 0
            android.util.SparseArray<b.i.b.h.d> r2 = r0.f460r
            r2.clear()
            android.util.SparseArray<b.i.b.h.d> r2 = r0.f460r
            b.i.b.h.e r6 = r0.f447e
            r2.put(r10, r6)
            android.util.SparseArray<b.i.b.h.d> r2 = r0.f460r
            int r6 = r26.getId()
            b.i.b.h.e r8 = r0.f447e
            r2.put(r6, r8)
            r2 = 0
        L_0x01c5:
            if (r2 >= r5) goto L_0x01db
            android.view.View r6 = r0.getChildAt(r2)
            b.i.b.h.d r8 = r0.mo597e(r6)
            android.util.SparseArray<b.i.b.h.d> r10 = r0.f460r
            int r6 = r6.getId()
            r10.put(r6, r8)
            int r2 = r2 + 1
            goto L_0x01c5
        L_0x01db:
            r10 = 0
        L_0x01dc:
            if (r10 >= r5) goto L_0x0595
            android.view.View r2 = r0.getChildAt(r10)
            b.i.b.h.d r6 = r0.mo597e(r2)
            if (r6 != 0) goto L_0x01f5
            r17 = r1
            r23 = r3
            r16 = r5
            r3 = r7
            r1 = r9
            r18 = r10
        L_0x01f2:
            r10 = 0
            goto L_0x0588
        L_0x01f5:
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0087a) r8
            b.i.b.h.e r11 = r0.f447e
            java.util.ArrayList<b.i.b.h.d> r12 = r11.f3998l0
            r12.add(r6)
            b.i.b.h.d r12 = r6.f3917P
            if (r12 == 0) goto L_0x0210
            b.i.b.h.k r12 = (p009b.p077i.p080b.p081h.C1294k) r12
            java.util.ArrayList<b.i.b.h.d> r12 = r12.f3998l0
            r12.remove(r6)
            r6.mo3906B()
        L_0x0210:
            r6.f3917P = r11
            android.util.SparseArray<b.i.b.h.d> r11 = r0.f460r
            b.i.b.h.d$a r12 = p009b.p077i.p080b.p081h.C1286d.C1287a.MATCH_PARENT
            b.i.b.h.d$a r13 = p009b.p077i.p080b.p081h.C1286d.C1287a.WRAP_CONTENT
            b.i.b.h.d$a r14 = p009b.p077i.p080b.p081h.C1286d.C1287a.FIXED
            b.i.b.h.d$a r15 = p009b.p077i.p080b.p081h.C1286d.C1287a.MATCH_CONSTRAINT
            b.i.b.h.c$a r9 = p009b.p077i.p080b.p081h.C1284c.C1285a.RIGHT
            b.i.b.h.c$a r7 = p009b.p077i.p080b.p081h.C1284c.C1285a.LEFT
            b.i.b.h.c$a r4 = p009b.p077i.p080b.p081h.C1284c.C1285a.BOTTOM
            r16 = r5
            b.i.b.h.c$a r5 = p009b.p077i.p080b.p081h.C1284c.C1285a.TOP
            r8.mo627a()
            r17 = r1
            int r1 = r2.getVisibility()
            r6.f3933c0 = r1
            boolean r1 = r8.f491a0
            if (r1 == 0) goto L_0x023c
            r1 = 1
            r6.f3964z = r1
            r1 = 8
            r6.f3933c0 = r1
        L_0x023c:
            r6.f3931b0 = r2
            boolean r1 = r2 instanceof p009b.p077i.p083c.C1317b
            if (r1 == 0) goto L_0x024b
            b.i.c.b r2 = (p009b.p077i.p083c.C1317b) r2
            b.i.b.h.e r1 = r0.f447e
            boolean r1 = r1.f3978p0
            r2.mo584g(r6, r1)
        L_0x024b:
            boolean r1 = r8.f488Y
            if (r1 == 0) goto L_0x0286
            b.i.b.h.f r6 = (p009b.p077i.p080b.p081h.C1289f) r6
            int r1 = r8.f507i0
            int r2 = r8.f509j0
            float r4 = r8.f511k0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0267
            if (r7 <= 0) goto L_0x027d
            r6.f3989l0 = r4
            r4 = -1
            r6.f3990m0 = r4
            r6.f3991n0 = r4
            goto L_0x027d
        L_0x0267:
            r4 = -1
            if (r1 == r4) goto L_0x0273
            if (r1 <= r4) goto L_0x027d
            r6.f3989l0 = r5
            r6.f3990m0 = r1
            r6.f3991n0 = r4
            goto L_0x027d
        L_0x0273:
            if (r2 == r4) goto L_0x027d
            if (r2 <= r4) goto L_0x027d
            r6.f3989l0 = r5
            r6.f3990m0 = r4
            r6.f3991n0 = r2
        L_0x027d:
            r23 = r3
            r18 = r10
            r1 = 2
            r3 = -1
            r4 = 1
            goto L_0x01f2
        L_0x0286:
            int r1 = r8.f493b0
            int r2 = r8.f495c0
            r18 = r10
            int r10 = r8.f497d0
            r19 = r13
            int r13 = r8.f499e0
            r20 = r14
            int r14 = r8.f501f0
            r21 = r12
            int r12 = r8.f503g0
            r22 = r15
            float r15 = r8.f505h0
            r23 = r3
            int r3 = r8.f514m
            r24 = r15
            r15 = -1
            if (r3 == r15) goto L_0x02c6
            java.lang.Object r1 = r11.get(r3)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            if (r1 == 0) goto L_0x03f0
            float r2 = r8.f516o
            int r3 = r8.f515n
            b.i.b.h.c$a r10 = p009b.p077i.p080b.p081h.C1284c.C1285a.CENTER
            b.i.b.h.c r11 = r6.mo3925i(r10)
            b.i.b.h.c r1 = r1.mo3925i(r10)
            r10 = 0
            r12 = 1
            r11.mo3895a(r1, r3, r10, r12)
            r6.f3962x = r2
            goto L_0x03f0
        L_0x02c6:
            r3 = r15
            if (r1 == r3) goto L_0x02dc
            java.lang.Object r1 = r11.get(r1)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            if (r1 == 0) goto L_0x02f4
            int r2 = r8.leftMargin
            b.i.b.h.c r15 = r6.mo3925i(r7)
            b.i.b.h.c r1 = r1.mo3925i(r7)
            goto L_0x02f0
        L_0x02dc:
            if (r2 == r3) goto L_0x02f6
            java.lang.Object r1 = r11.get(r2)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            if (r1 == 0) goto L_0x02f4
            int r2 = r8.leftMargin
            b.i.b.h.c r15 = r6.mo3925i(r7)
            b.i.b.h.c r1 = r1.mo3925i(r9)
        L_0x02f0:
            r3 = 1
            r15.mo3895a(r1, r2, r14, r3)
        L_0x02f4:
            r1 = -1
            goto L_0x02f7
        L_0x02f6:
            r1 = r3
        L_0x02f7:
            if (r10 == r1) goto L_0x030c
            java.lang.Object r2 = r11.get(r10)
            b.i.b.h.d r2 = (p009b.p077i.p080b.p081h.C1286d) r2
            if (r2 == 0) goto L_0x0324
            int r3 = r8.rightMargin
            b.i.b.h.c r10 = r6.mo3925i(r9)
            b.i.b.h.c r2 = r2.mo3925i(r7)
            goto L_0x0320
        L_0x030c:
            if (r13 == r1) goto L_0x0324
            java.lang.Object r1 = r11.get(r13)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            if (r1 == 0) goto L_0x0324
            int r3 = r8.rightMargin
            b.i.b.h.c r10 = r6.mo3925i(r9)
            b.i.b.h.c r2 = r1.mo3925i(r9)
        L_0x0320:
            r1 = 1
            r10.mo3895a(r2, r3, r12, r1)
        L_0x0324:
            int r1 = r8.f504h
            r2 = -1
            if (r1 == r2) goto L_0x033e
            java.lang.Object r1 = r11.get(r1)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            if (r1 == 0) goto L_0x035a
            int r3 = r8.topMargin
            int r10 = r8.f522u
            b.i.b.h.c r12 = r6.mo3925i(r5)
            b.i.b.h.c r1 = r1.mo3925i(r5)
            goto L_0x0356
        L_0x033e:
            int r1 = r8.f506i
            if (r1 == r2) goto L_0x035a
            java.lang.Object r1 = r11.get(r1)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            if (r1 == 0) goto L_0x035a
            int r3 = r8.topMargin
            int r10 = r8.f522u
            b.i.b.h.c r12 = r6.mo3925i(r5)
            b.i.b.h.c r1 = r1.mo3925i(r4)
        L_0x0356:
            r2 = 1
            r12.mo3895a(r1, r3, r10, r2)
        L_0x035a:
            int r1 = r8.f508j
            r2 = -1
            if (r1 == r2) goto L_0x0374
            java.lang.Object r1 = r11.get(r1)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            if (r1 == 0) goto L_0x0390
            int r3 = r8.bottomMargin
            int r10 = r8.f524w
            b.i.b.h.c r12 = r6.mo3925i(r4)
            b.i.b.h.c r1 = r1.mo3925i(r5)
            goto L_0x038c
        L_0x0374:
            int r1 = r8.f510k
            if (r1 == r2) goto L_0x0390
            java.lang.Object r1 = r11.get(r1)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            if (r1 == 0) goto L_0x0390
            int r3 = r8.bottomMargin
            int r10 = r8.f524w
            b.i.b.h.c r12 = r6.mo3925i(r4)
            b.i.b.h.c r1 = r1.mo3925i(r4)
        L_0x038c:
            r2 = 1
            r12.mo3895a(r1, r3, r10, r2)
        L_0x0390:
            int r1 = r8.f512l
            r2 = -1
            if (r1 == r2) goto L_0x03df
            android.util.SparseArray<android.view.View> r2 = r0.f445c
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f512l
            java.lang.Object r2 = r11.get(r2)
            b.i.b.h.d r2 = (p009b.p077i.p080b.p081h.C1286d) r2
            if (r2 == 0) goto L_0x03df
            if (r1 == 0) goto L_0x03df
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0087a
            if (r3 == 0) goto L_0x03df
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0087a) r1
            r3 = 1
            r8.f487X = r3
            r1.f487X = r3
            b.i.b.h.c$a r10 = p009b.p077i.p080b.p081h.C1284c.C1285a.BASELINE
            b.i.b.h.c r11 = r6.mo3925i(r10)
            b.i.b.h.c r2 = r2.mo3925i(r10)
            r10 = 0
            r12 = -1
            r11.mo3895a(r2, r10, r12, r3)
            r6.f3963y = r3
            b.i.b.h.d r1 = r1.f513l0
            r1.f3963y = r3
            b.i.b.h.c r1 = r6.mo3925i(r5)
            r1.mo3902h()
            b.i.b.h.c r1 = r6.mo3925i(r4)
            r1.mo3902h()
        L_0x03df:
            r1 = 0
            int r2 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x03e8
            r2 = r24
            r6.f3927Z = r2
        L_0x03e8:
            float r2 = r8.f464A
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x03f0
            r6.f3929a0 = r2
        L_0x03f0:
            if (r23 == 0) goto L_0x0401
            int r1 = r8.f479P
            r2 = -1
            if (r1 != r2) goto L_0x03fb
            int r3 = r8.f480Q
            if (r3 == r2) goto L_0x0401
        L_0x03fb:
            int r2 = r8.f480Q
            r6.f3922U = r1
            r6.f3923V = r2
        L_0x0401:
            boolean r1 = r8.f485V
            r2 = -2
            if (r1 != 0) goto L_0x0434
            int r1 = r8.width
            r3 = -1
            if (r1 != r3) goto L_0x042b
            boolean r1 = r8.f482S
            if (r1 == 0) goto L_0x0415
            b.i.b.h.d$a[] r1 = r6.f3916O
            r3 = 0
            r1[r3] = r22
            goto L_0x041a
        L_0x0415:
            r3 = 0
            b.i.b.h.d$a[] r1 = r6.f3916O
            r1[r3] = r21
        L_0x041a:
            b.i.b.h.c r1 = r6.mo3925i(r7)
            int r7 = r8.leftMargin
            r1.f3889g = r7
            b.i.b.h.c r1 = r6.mo3925i(r9)
            int r7 = r8.rightMargin
            r1.f3889g = r7
            goto L_0x0446
        L_0x042b:
            r3 = 0
            b.i.b.h.d$a[] r1 = r6.f3916O
            r1[r3] = r22
            r6.mo3917M(r3)
            goto L_0x0446
        L_0x0434:
            r3 = 0
            b.i.b.h.d$a[] r1 = r6.f3916O
            r1[r3] = r20
            int r1 = r8.width
            r6.mo3917M(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x0446
            b.i.b.h.d$a[] r1 = r6.f3916O
            r1[r3] = r19
        L_0x0446:
            boolean r1 = r8.f486W
            if (r1 != 0) goto L_0x0479
            int r1 = r8.height
            r3 = -1
            if (r1 != r3) goto L_0x046f
            boolean r1 = r8.f483T
            if (r1 == 0) goto L_0x0459
            b.i.b.h.d$a[] r1 = r6.f3916O
            r7 = 1
            r1[r7] = r22
            goto L_0x045e
        L_0x0459:
            r7 = 1
            b.i.b.h.d$a[] r1 = r6.f3916O
            r1[r7] = r21
        L_0x045e:
            b.i.b.h.c r1 = r6.mo3925i(r5)
            int r2 = r8.topMargin
            r1.f3889g = r2
            b.i.b.h.c r1 = r6.mo3925i(r4)
            int r2 = r8.bottomMargin
            r1.f3889g = r2
            goto L_0x048c
        L_0x046f:
            r7 = 1
            b.i.b.h.d$a[] r1 = r6.f3916O
            r1[r7] = r22
            r1 = 0
            r6.mo3912H(r1)
            goto L_0x048c
        L_0x0479:
            r3 = -1
            r7 = 1
            b.i.b.h.d$a[] r1 = r6.f3916O
            r1[r7] = r20
            int r1 = r8.height
            r6.mo3912H(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x048c
            b.i.b.h.d$a[] r1 = r6.f3916O
            r1[r7] = r19
        L_0x048c:
            java.lang.String r1 = r8.f465B
            if (r1 == 0) goto L_0x0528
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0498
            goto L_0x0528
        L_0x0498:
            int r2 = r1.length()
            r4 = 44
            int r4 = r1.indexOf(r4)
            if (r4 <= 0) goto L_0x04ca
            int r5 = r2 + -1
            if (r4 >= r5) goto L_0x04ca
            r5 = 0
            java.lang.String r7 = r1.substring(r5, r4)
            java.lang.String r5 = "W"
            boolean r5 = r7.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04b7
            r10 = 0
            goto L_0x04c2
        L_0x04b7:
            java.lang.String r5 = "H"
            boolean r5 = r7.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04c1
            r10 = 1
            goto L_0x04c2
        L_0x04c1:
            r10 = r3
        L_0x04c2:
            int r4 = r4 + 1
            r25 = r10
            r10 = r4
            r4 = r25
            goto L_0x04cc
        L_0x04ca:
            r4 = r3
            r10 = 0
        L_0x04cc:
            r5 = 58
            int r5 = r1.indexOf(r5)
            if (r5 < 0) goto L_0x050e
            int r2 = r2 + -1
            if (r5 >= r2) goto L_0x050e
            java.lang.String r2 = r1.substring(r10, r5)
            int r5 = r5 + 1
            java.lang.String r1 = r1.substring(r5)
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x051d
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x051d
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x051d }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x051d }
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x051d
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x051d
            r5 = 1
            if (r4 != r5) goto L_0x0508
            float r1 = r1 / r2
            float r1 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x051d }
            goto L_0x051e
        L_0x0508:
            float r2 = r2 / r1
            float r1 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x051d }
            goto L_0x051e
        L_0x050e:
            java.lang.String r1 = r1.substring(r10)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x051d
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x051d }
            goto L_0x051e
        L_0x051d:
            r1 = 0
        L_0x051e:
            r2 = 0
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x052b
            r6.f3920S = r1
            r6.f3921T = r4
            goto L_0x052b
        L_0x0528:
            r2 = 0
            r6.f3920S = r2
        L_0x052b:
            float r1 = r8.f467D
            float[] r2 = r6.f3941g0
            r10 = 0
            r2[r10] = r1
            float r1 = r8.f468E
            r4 = 1
            r2[r4] = r1
            int r1 = r8.f469F
            r6.f3937e0 = r1
            int r1 = r8.f470G
            r6.f3939f0 = r1
            int r1 = r8.f471H
            int r2 = r8.f473J
            int r5 = r8.f475L
            float r7 = r8.f477N
            r6.f3950l = r1
            r6.f3953o = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r2) goto L_0x0551
            r5 = r10
        L_0x0551:
            r6.f3954p = r5
            r6.f3955q = r7
            r5 = 0
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r9 <= 0) goto L_0x0565
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0565
            if (r1 != 0) goto L_0x0565
            r1 = 2
            r6.f3950l = r1
        L_0x0565:
            int r1 = r8.f472I
            int r7 = r8.f474K
            int r9 = r8.f476M
            float r8 = r8.f478O
            r6.f3951m = r1
            r6.f3956r = r7
            if (r9 != r2) goto L_0x0574
            r9 = r10
        L_0x0574:
            r6.f3957s = r9
            r6.f3958t = r8
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0587
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0587
            if (r1 != 0) goto L_0x0587
            r1 = 2
            r6.f3951m = r1
            goto L_0x0588
        L_0x0587:
            r1 = 2
        L_0x0588:
            int r2 = r18 + 1
            r9 = r1
            r10 = r2
            r7 = r3
            r5 = r16
            r1 = r17
            r3 = r23
            goto L_0x01dc
        L_0x0595:
            r17 = r1
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo611j():boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0087a aVar = (C0087a) childAt.getLayoutParams();
            C1286d dVar = aVar.f513l0;
            if ((childAt.getVisibility() != 8 || aVar.f488Y || aVar.f489Z || isInEditMode) && !aVar.f491a0) {
                int s = dVar.mo3935s();
                int t = dVar.mo3936t();
                int r = dVar.mo3934r() + s;
                int l = dVar.mo3928l() + t;
                childAt.layout(s, t, r, l);
                if ((childAt instanceof C1330g) && (content = ((C1330g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s, t, r, l);
                }
            }
        }
        int size = this.f446d.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f446d.get(i6).mo4005h();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x025b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05e0  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x05e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r1 = r31
            r2 = r32
            boolean r0 = r7.f452j
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0023
            int r0 = r30.getChildCount()
            r5 = r4
        L_0x0011:
            if (r5 >= r0) goto L_0x0023
            android.view.View r6 = r7.getChildAt(r5)
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L_0x0020
            r7.f452j = r3
            goto L_0x0023
        L_0x0020:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0023:
            boolean r0 = r7.f452j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0086
            int r0 = r7.f462t
            if (r0 != r1) goto L_0x004f
            int r8 = r7.f463u
            if (r8 != r2) goto L_0x004f
            b.i.b.h.e r0 = r7.f447e
            int r3 = r0.mo3934r()
            b.i.b.h.e r0 = r7.f447e
            int r4 = r0.mo3928l()
            b.i.b.h.e r0 = r7.f447e
            boolean r5 = r0.f3987y0
        L_0x0043:
            boolean r6 = r0.f3988z0
            r0 = r30
            r1 = r31
            r2 = r32
        L_0x004b:
            r0.mo609h(r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            if (r0 != r1) goto L_0x0086
            int r0 = android.view.View.MeasureSpec.getMode(r31)
            if (r0 != r6) goto L_0x0086
            int r0 = android.view.View.MeasureSpec.getMode(r32)
            if (r0 != r5) goto L_0x0086
            int r0 = r7.f463u
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            if (r0 != r5) goto L_0x0086
            int r0 = android.view.View.MeasureSpec.getSize(r32)
            b.i.b.h.e r8 = r7.f447e
            int r8 = r8.mo3928l()
            if (r0 < r8) goto L_0x0086
            r7.f462t = r1
            r7.f463u = r2
            b.i.b.h.e r0 = r7.f447e
            int r3 = r0.mo3934r()
            b.i.b.h.e r0 = r7.f447e
            int r4 = r0.mo3928l()
            b.i.b.h.e r0 = r7.f447e
            boolean r5 = r0.f3987y0
            goto L_0x0043
        L_0x0086:
            r7.f462t = r1
            r7.f463u = r2
            b.i.b.h.e r0 = r7.f447e
            boolean r8 = r30.mo600g()
            r0.f3978p0 = r8
            boolean r0 = r7.f452j
            if (r0 == 0) goto L_0x00a5
            r7.f452j = r4
            boolean r0 = r30.mo611j()
            if (r0 == 0) goto L_0x00a5
            b.i.b.h.e r0 = r7.f447e
            b.i.b.h.l.b r8 = r0.f3975m0
            r8.mo3958c(r0)
        L_0x00a5:
            b.i.b.h.e r0 = r7.f447e
            int r8 = r7.f453k
            b.i.b.h.d$a r9 = p009b.p077i.p080b.p081h.C1286d.C1287a.FIXED
            int r10 = android.view.View.MeasureSpec.getMode(r31)
            int r11 = android.view.View.MeasureSpec.getSize(r31)
            int r12 = android.view.View.MeasureSpec.getMode(r32)
            int r13 = android.view.View.MeasureSpec.getSize(r32)
            int r14 = r30.getPaddingTop()
            int r14 = java.lang.Math.max(r4, r14)
            int r15 = r30.getPaddingBottom()
            int r15 = java.lang.Math.max(r4, r15)
            int r3 = r14 + r15
            int r6 = r30.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = r7.f461s
            r5.f530b = r14
            r5.f531c = r15
            r5.f532d = r6
            r5.f533e = r3
            r5.f534f = r1
            r5.f535g = r2
            int r5 = r30.getPaddingStart()
            int r5 = java.lang.Math.max(r4, r5)
            int r15 = r30.getPaddingEnd()
            int r15 = java.lang.Math.max(r4, r15)
            if (r5 > 0) goto L_0x00fd
            if (r15 <= 0) goto L_0x00f4
            goto L_0x00fd
        L_0x00f4:
            int r5 = r30.getPaddingLeft()
            int r5 = java.lang.Math.max(r4, r5)
            goto L_0x0104
        L_0x00fd:
            boolean r19 = r30.mo600g()
            if (r19 == 0) goto L_0x0104
            r5 = r15
        L_0x0104:
            int r11 = r11 - r6
            int r13 = r13 - r3
            b.i.b.h.d$a r3 = p009b.p077i.p080b.p081h.C1286d.C1287a.WRAP_CONTENT
            androidx.constraintlayout.widget.ConstraintLayout$b r6 = r7.f461s
            int r15 = r6.f533e
            int r6 = r6.f532d
            int r19 = r30.getChildCount()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r4) goto L_0x0130
            if (r10 == 0) goto L_0x012a
            r4 = 1073741824(0x40000000, float:2.0)
            if (r10 == r4) goto L_0x011e
            r4 = r9
            goto L_0x012e
        L_0x011e:
            int r4 = r7.f450h
            int r4 = r4 - r6
            int r4 = java.lang.Math.min(r4, r11)
            r1 = r4
            r4 = r9
        L_0x0127:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x013f
        L_0x012a:
            if (r19 != 0) goto L_0x012d
            goto L_0x0132
        L_0x012d:
            r4 = r3
        L_0x012e:
            r1 = 0
            goto L_0x0127
        L_0x0130:
            if (r19 != 0) goto L_0x013a
        L_0x0132:
            int r4 = r7.f448f
            r1 = 0
            int r4 = java.lang.Math.max(r1, r4)
            goto L_0x013b
        L_0x013a:
            r4 = r11
        L_0x013b:
            r1 = r4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r3
        L_0x013f:
            if (r12 == r2) goto L_0x0162
            if (r12 == 0) goto L_0x0158
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0149
            r2 = r9
            goto L_0x015c
        L_0x0149:
            int r2 = r7.f451i
            int r2 = r2 - r15
            int r2 = java.lang.Math.min(r2, r13)
            r19 = r3
            r18 = r9
            r9 = r2
            r2 = r18
            goto L_0x0175
        L_0x0158:
            if (r19 != 0) goto L_0x015b
            goto L_0x0164
        L_0x015b:
            r2 = r3
        L_0x015c:
            r19 = r3
            r18 = r9
            r9 = 0
            goto L_0x0175
        L_0x0162:
            if (r19 != 0) goto L_0x016e
        L_0x0164:
            int r2 = r7.f449g
            r18 = r9
            r9 = 0
            int r2 = java.lang.Math.max(r9, r2)
            goto L_0x0171
        L_0x016e:
            r18 = r9
            r2 = r13
        L_0x0171:
            r9 = r2
            r2 = r3
            r19 = r2
        L_0x0175:
            int r3 = r0.mo3934r()
            if (r1 != r3) goto L_0x0187
            int r3 = r0.mo3928l()
            if (r9 == r3) goto L_0x0182
            goto L_0x0187
        L_0x0182:
            r21 = r13
            r3 = 0
            r13 = 1
            goto L_0x018f
        L_0x0187:
            b.i.b.h.l.e r3 = r0.f3976n0
            r21 = r13
            r13 = 1
            r3.f4016c = r13
            r3 = 0
        L_0x018f:
            r0.f3922U = r3
            r0.f3923V = r3
            int r13 = r7.f450h
            int r13 = r13 - r6
            r22 = r11
            int[] r11 = r0.f3961w
            r11[r3] = r13
            int r13 = r7.f451i
            int r13 = r13 - r15
            r16 = 1
            r11[r16] = r13
            r0.mo3915K(r3)
            r0.mo3914J(r3)
            b.i.b.h.d$a[] r11 = r0.f3916O
            r11[r3] = r4
            r0.mo3917M(r1)
            b.i.b.h.d$a[] r1 = r0.f3916O
            r1[r16] = r2
            r0.mo3912H(r9)
            int r1 = r7.f448f
            int r1 = r1 - r6
            r0.mo3915K(r1)
            int r1 = r7.f449g
            int r1 = r1 - r15
            r0.mo3914J(r1)
            r0.f3980r0 = r5
            r0.f3981s0 = r14
            b.i.b.h.l.b r1 = r0.f3975m0
            java.util.Objects.requireNonNull(r1)
            b.i.b.h.c$a r2 = p009b.p077i.p080b.p081h.C1284c.C1285a.BOTTOM
            b.i.b.h.c$a r3 = p009b.p077i.p080b.p081h.C1284c.C1285a.RIGHT
            b.i.b.h.d$a r4 = p009b.p077i.p080b.p081h.C1286d.C1287a.MATCH_CONSTRAINT
            b.i.b.h.l.b$b r5 = r0.f3977o0
            java.util.ArrayList<b.i.b.h.d> r6 = r0.f3998l0
            int r6 = r6.size()
            int r9 = r0.mo3934r()
            int r11 = r0.mo3928l()
            r13 = 128(0x80, float:1.794E-43)
            boolean r13 = p009b.p077i.p080b.p081h.C1292i.m3170b(r8, r13)
            r14 = 64
            if (r13 != 0) goto L_0x01f5
            boolean r8 = p009b.p077i.p080b.p081h.C1292i.m3170b(r8, r14)
            if (r8 == 0) goto L_0x01f3
            goto L_0x01f5
        L_0x01f3:
            r8 = 0
            goto L_0x01f6
        L_0x01f5:
            r8 = 1
        L_0x01f6:
            if (r8 == 0) goto L_0x0255
            r14 = 0
        L_0x01f9:
            if (r14 >= r6) goto L_0x0255
            java.util.ArrayList<b.i.b.h.d> r15 = r0.f3998l0
            java.lang.Object r15 = r15.get(r14)
            b.i.b.h.d r15 = (p009b.p077i.p080b.p081h.C1286d) r15
            r24 = r8
            b.i.b.h.d$a r8 = r15.mo3929m()
            if (r8 != r4) goto L_0x020d
            r8 = 1
            goto L_0x020e
        L_0x020d:
            r8 = 0
        L_0x020e:
            b.i.b.h.d$a r7 = r15.mo3933q()
            if (r7 != r4) goto L_0x0216
            r7 = 1
            goto L_0x0217
        L_0x0216:
            r7 = 0
        L_0x0217:
            if (r8 == 0) goto L_0x0224
            if (r7 == 0) goto L_0x0224
            float r7 = r15.f3920S
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0224
            r7 = 1
            goto L_0x0225
        L_0x0224:
            r7 = 0
        L_0x0225:
            boolean r8 = r15.mo3939w()
            if (r8 == 0) goto L_0x022e
            if (r7 == 0) goto L_0x022e
            goto L_0x0250
        L_0x022e:
            boolean r8 = r15.mo3940x()
            if (r8 == 0) goto L_0x0237
            if (r7 == 0) goto L_0x0237
            goto L_0x0250
        L_0x0237:
            boolean r7 = r15 instanceof p009b.p077i.p080b.p081h.C1293j
            if (r7 == 0) goto L_0x023c
            goto L_0x0250
        L_0x023c:
            boolean r7 = r15.mo3939w()
            if (r7 != 0) goto L_0x0250
            boolean r7 = r15.mo3940x()
            if (r7 == 0) goto L_0x0249
            goto L_0x0250
        L_0x0249:
            int r14 = r14 + 1
            r7 = r30
            r8 = r24
            goto L_0x01f9
        L_0x0250:
            r7 = 1073741824(0x40000000, float:2.0)
            r24 = 0
            goto L_0x0259
        L_0x0255:
            r24 = r8
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x0259:
            if (r10 != r7) goto L_0x025d
            if (r12 == r7) goto L_0x025f
        L_0x025d:
            if (r13 == 0) goto L_0x0261
        L_0x025f:
            r7 = 1
            goto L_0x0262
        L_0x0261:
            r7 = 0
        L_0x0262:
            r7 = r24 & r7
            if (r7 == 0) goto L_0x052f
            int[] r14 = r0.f3961w
            r15 = 0
            r14 = r14[r15]
            r15 = r22
            int r14 = java.lang.Math.min(r14, r15)
            int[] r15 = r0.f3961w
            r16 = 1
            r15 = r15[r16]
            r8 = r21
            int r8 = java.lang.Math.min(r15, r8)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r10 != r15) goto L_0x0290
            int r15 = r0.mo3934r()
            if (r15 == r14) goto L_0x028d
            r0.mo3917M(r14)
            r0.mo3949W()
        L_0x028d:
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x0291
        L_0x0290:
            r14 = r15
        L_0x0291:
            if (r12 != r14) goto L_0x029f
            int r15 = r0.mo3928l()
            if (r15 == r8) goto L_0x029f
            r0.mo3912H(r8)
            r0.mo3949W()
        L_0x029f:
            if (r10 != r14) goto L_0x047d
            if (r12 != r14) goto L_0x047d
            b.i.b.h.l.e r8 = r0.f3976n0
            b.i.b.h.d$a r14 = p009b.p077i.p080b.p081h.C1286d.C1287a.MATCH_PARENT
            r15 = 1
            r13 = r13 & r15
            boolean r15 = r8.f4015b
            if (r15 != 0) goto L_0x02b6
            boolean r15 = r8.f4016c
            if (r15 == 0) goto L_0x02b2
            goto L_0x02b6
        L_0x02b2:
            r21 = r7
            r15 = 0
            goto L_0x02ff
        L_0x02b6:
            b.i.b.h.e r15 = r8.f4014a
            java.util.ArrayList<b.i.b.h.d> r15 = r15.f3998l0
            java.util.Iterator r15 = r15.iterator()
        L_0x02be:
            boolean r21 = r15.hasNext()
            if (r21 == 0) goto L_0x02e5
            java.lang.Object r21 = r15.next()
            r24 = r15
            r15 = r21
            b.i.b.h.d r15 = (p009b.p077i.p080b.p081h.C1286d) r15
            r15.mo3924h()
            r21 = r7
            r7 = 0
            r15.f3928a = r7
            b.i.b.h.l.k r7 = r15.f3934d
            r7.mo3981n()
            b.i.b.h.l.m r7 = r15.f3936e
            r7.mo3985m()
            r7 = r21
            r15 = r24
            goto L_0x02be
        L_0x02e5:
            r21 = r7
            b.i.b.h.e r7 = r8.f4014a
            r7.mo3924h()
            b.i.b.h.e r7 = r8.f4014a
            r15 = 0
            r7.f3928a = r15
            b.i.b.h.l.k r7 = r7.f3934d
            r7.mo3981n()
            b.i.b.h.e r7 = r8.f4014a
            b.i.b.h.l.m r7 = r7.f3936e
            r7.mo3985m()
            r8.f4016c = r15
        L_0x02ff:
            b.i.b.h.e r7 = r8.f4017d
            r8.mo3969b(r7)
            b.i.b.h.e r7 = r8.f4014a
            r7.f3922U = r15
            r7.f3923V = r15
            b.i.b.h.d$a r7 = r7.mo3927k(r15)
            b.i.b.h.e r15 = r8.f4014a
            r24 = r2
            r2 = 1
            b.i.b.h.d$a r15 = r15.mo3927k(r2)
            boolean r2 = r8.f4015b
            if (r2 == 0) goto L_0x031e
            r8.mo3970c()
        L_0x031e:
            b.i.b.h.e r2 = r8.f4014a
            int r2 = r2.mo3935s()
            r25 = r3
            b.i.b.h.e r3 = r8.f4014a
            int r3 = r3.mo3936t()
            r26 = r5
            b.i.b.h.e r5 = r8.f4014a
            b.i.b.h.l.k r5 = r5.f3934d
            b.i.b.h.l.f r5 = r5.f4064h
            r5.mo3976c(r2)
            b.i.b.h.e r5 = r8.f4014a
            b.i.b.h.l.m r5 = r5.f3936e
            b.i.b.h.l.f r5 = r5.f4064h
            r5.mo3976c(r3)
            r8.mo3974g()
            r5 = r19
            if (r7 == r5) goto L_0x034f
            if (r15 != r5) goto L_0x034a
            goto L_0x034f
        L_0x034a:
            r27 = r9
            r28 = r11
            goto L_0x03b4
        L_0x034f:
            r19 = r13
            if (r13 == 0) goto L_0x036d
            java.util.ArrayList<b.i.b.h.l.o> r13 = r8.f4018e
            java.util.Iterator r13 = r13.iterator()
        L_0x0359:
            boolean r27 = r13.hasNext()
            if (r27 == 0) goto L_0x036d
            java.lang.Object r27 = r13.next()
            b.i.b.h.l.o r27 = (p009b.p077i.p080b.p081h.p082l.C1313o) r27
            boolean r27 = r27.mo3964k()
            if (r27 != 0) goto L_0x0359
            r19 = 0
        L_0x036d:
            if (r19 == 0) goto L_0x0391
            if (r7 != r5) goto L_0x0391
            b.i.b.h.e r13 = r8.f4014a
            r27 = r9
            b.i.b.h.d$a[] r9 = r13.f3916O
            r28 = r11
            r11 = 0
            r9[r11] = r18
            int r9 = r8.mo3971d(r13, r11)
            r13.mo3917M(r9)
            b.i.b.h.e r9 = r8.f4014a
            b.i.b.h.l.k r11 = r9.f3934d
            b.i.b.h.l.g r11 = r11.f4061e
            int r9 = r9.mo3934r()
            r11.mo3976c(r9)
            goto L_0x0395
        L_0x0391:
            r27 = r9
            r28 = r11
        L_0x0395:
            if (r19 == 0) goto L_0x03b4
            if (r15 != r5) goto L_0x03b4
            b.i.b.h.e r9 = r8.f4014a
            b.i.b.h.d$a[] r11 = r9.f3916O
            r13 = 1
            r11[r13] = r18
            int r11 = r8.mo3971d(r9, r13)
            r9.mo3912H(r11)
            b.i.b.h.e r9 = r8.f4014a
            b.i.b.h.l.m r11 = r9.f3936e
            b.i.b.h.l.g r11 = r11.f4061e
            int r9 = r9.mo3928l()
            r11.mo3976c(r9)
        L_0x03b4:
            b.i.b.h.e r9 = r8.f4014a
            b.i.b.h.d$a[] r11 = r9.f3916O
            r19 = r5
            r13 = 0
            r5 = r11[r13]
            r29 = r1
            r1 = r18
            if (r5 == r1) goto L_0x03ca
            r5 = r11[r13]
            if (r5 != r14) goto L_0x03c8
            goto L_0x03ca
        L_0x03c8:
            r1 = 0
            goto L_0x040e
        L_0x03ca:
            int r5 = r9.mo3934r()
            int r5 = r5 + r2
            b.i.b.h.e r9 = r8.f4014a
            b.i.b.h.l.k r9 = r9.f3934d
            b.i.b.h.l.f r9 = r9.f4065i
            r9.mo3976c(r5)
            b.i.b.h.e r9 = r8.f4014a
            b.i.b.h.l.k r9 = r9.f3934d
            b.i.b.h.l.g r9 = r9.f4061e
            int r5 = r5 - r2
            r9.mo3976c(r5)
            r8.mo3974g()
            b.i.b.h.e r2 = r8.f4014a
            b.i.b.h.d$a[] r5 = r2.f3916O
            r9 = 1
            r11 = r5[r9]
            if (r11 == r1) goto L_0x03f2
            r1 = r5[r9]
            if (r1 != r14) goto L_0x040a
        L_0x03f2:
            int r1 = r2.mo3928l()
            int r1 = r1 + r3
            b.i.b.h.e r2 = r8.f4014a
            b.i.b.h.l.m r2 = r2.f3936e
            b.i.b.h.l.f r2 = r2.f4065i
            r2.mo3976c(r1)
            b.i.b.h.e r2 = r8.f4014a
            b.i.b.h.l.m r2 = r2.f3936e
            b.i.b.h.l.g r2 = r2.f4061e
            int r1 = r1 - r3
            r2.mo3976c(r1)
        L_0x040a:
            r8.mo3974g()
            r1 = 1
        L_0x040e:
            java.util.ArrayList<b.i.b.h.l.o> r2 = r8.f4018e
            java.util.Iterator r2 = r2.iterator()
        L_0x0414:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x042f
            java.lang.Object r3 = r2.next()
            b.i.b.h.l.o r3 = (p009b.p077i.p080b.p081h.p082l.C1313o) r3
            b.i.b.h.d r5 = r3.f4058b
            b.i.b.h.e r9 = r8.f4014a
            if (r5 != r9) goto L_0x042b
            boolean r5 = r3.f4063g
            if (r5 != 0) goto L_0x042b
            goto L_0x0414
        L_0x042b:
            r3.mo3961e()
            goto L_0x0414
        L_0x042f:
            java.util.ArrayList<b.i.b.h.l.o> r2 = r8.f4018e
            java.util.Iterator r2 = r2.iterator()
        L_0x0435:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x046c
            java.lang.Object r3 = r2.next()
            b.i.b.h.l.o r3 = (p009b.p077i.p080b.p081h.p082l.C1313o) r3
            if (r1 != 0) goto L_0x044a
            b.i.b.h.d r5 = r3.f4058b
            b.i.b.h.e r9 = r8.f4014a
            if (r5 != r9) goto L_0x044a
            goto L_0x0435
        L_0x044a:
            b.i.b.h.l.f r5 = r3.f4064h
            boolean r5 = r5.f4031j
            if (r5 != 0) goto L_0x0451
            goto L_0x046a
        L_0x0451:
            b.i.b.h.l.f r5 = r3.f4065i
            boolean r5 = r5.f4031j
            if (r5 != 0) goto L_0x045c
            boolean r5 = r3 instanceof p009b.p077i.p080b.p081h.p082l.C1306i
            if (r5 != 0) goto L_0x045c
            goto L_0x046a
        L_0x045c:
            b.i.b.h.l.g r5 = r3.f4061e
            boolean r5 = r5.f4031j
            if (r5 != 0) goto L_0x0435
            boolean r5 = r3 instanceof p009b.p077i.p080b.p081h.p082l.C1299c
            if (r5 != 0) goto L_0x0435
            boolean r3 = r3 instanceof p009b.p077i.p080b.p081h.p082l.C1306i
            if (r3 != 0) goto L_0x0435
        L_0x046a:
            r1 = 0
            goto L_0x046d
        L_0x046c:
            r1 = 1
        L_0x046d:
            b.i.b.h.e r2 = r8.f4014a
            r2.mo3913I(r7)
            b.i.b.h.e r2 = r8.f4014a
            r2.mo3916L(r15)
            r2 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r5 = 2
            goto L_0x051f
        L_0x047d:
            r29 = r1
            r24 = r2
            r25 = r3
            r26 = r5
            r21 = r7
            r27 = r9
            r28 = r11
            b.i.b.h.l.e r1 = r0.f3976n0
            boolean r2 = r1.f4015b
            if (r2 == 0) goto L_0x04e8
            b.i.b.h.e r2 = r1.f4014a
            java.util.ArrayList<b.i.b.h.d> r2 = r2.f3998l0
            java.util.Iterator r2 = r2.iterator()
        L_0x0499:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c2
            java.lang.Object r3 = r2.next()
            b.i.b.h.d r3 = (p009b.p077i.p080b.p081h.C1286d) r3
            r3.mo3924h()
            r5 = 0
            r3.f3928a = r5
            b.i.b.h.l.k r7 = r3.f3934d
            b.i.b.h.l.g r8 = r7.f4061e
            r8.f4031j = r5
            r7.f4063g = r5
            r7.mo3981n()
            b.i.b.h.l.m r3 = r3.f3936e
            b.i.b.h.l.g r7 = r3.f4061e
            r7.f4031j = r5
            r3.f4063g = r5
            r3.mo3985m()
            goto L_0x0499
        L_0x04c2:
            r5 = 0
            b.i.b.h.e r2 = r1.f4014a
            r2.mo3924h()
            b.i.b.h.e r2 = r1.f4014a
            r2.f3928a = r5
            b.i.b.h.l.k r2 = r2.f3934d
            b.i.b.h.l.g r3 = r2.f4061e
            r3.f4031j = r5
            r2.f4063g = r5
            r2.mo3981n()
            b.i.b.h.e r2 = r1.f4014a
            b.i.b.h.l.m r2 = r2.f3936e
            b.i.b.h.l.g r3 = r2.f4061e
            r3.f4031j = r5
            r2.f4063g = r5
            r2.mo3985m()
            r1.mo3970c()
            goto L_0x04e9
        L_0x04e8:
            r5 = 0
        L_0x04e9:
            b.i.b.h.e r2 = r1.f4017d
            r1.mo3969b(r2)
            b.i.b.h.e r2 = r1.f4014a
            r2.f3922U = r5
            r2.f3923V = r5
            b.i.b.h.l.k r2 = r2.f3934d
            b.i.b.h.l.f r2 = r2.f4064h
            r2.mo3976c(r5)
            b.i.b.h.e r1 = r1.f4014a
            b.i.b.h.l.m r1 = r1.f3936e
            b.i.b.h.l.f r1 = r1.f4064h
            r1.mo3976c(r5)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0513
            boolean r2 = r0.mo3948V(r13, r5)
            r3 = 1
            r16 = r2 & 1
            r5 = r3
            r2 = r16
            goto L_0x0516
        L_0x0513:
            r3 = 1
            r2 = r3
            r5 = 0
        L_0x0516:
            if (r12 != r1) goto L_0x051f
            boolean r7 = r0.mo3948V(r13, r3)
            r2 = r2 & r7
            int r5 = r5 + 1
        L_0x051f:
            if (r2 == 0) goto L_0x053f
            if (r10 != r1) goto L_0x0525
            r3 = 1
            goto L_0x0526
        L_0x0525:
            r3 = 0
        L_0x0526:
            if (r12 != r1) goto L_0x052a
            r1 = 1
            goto L_0x052b
        L_0x052a:
            r1 = 0
        L_0x052b:
            r0.mo3918N(r3, r1)
            goto L_0x053f
        L_0x052f:
            r29 = r1
            r24 = r2
            r25 = r3
            r26 = r5
            r21 = r7
            r27 = r9
            r28 = r11
            r2 = 0
            r5 = 0
        L_0x053f:
            if (r2 == 0) goto L_0x0544
            r1 = 2
            if (r5 == r1) goto L_0x0821
        L_0x0544:
            int r1 = r0.f3986x0
            if (r6 <= 0) goto L_0x0626
            java.util.ArrayList<b.i.b.h.d> r2 = r0.f3998l0
            int r2 = r2.size()
            r3 = 64
            boolean r3 = r0.mo3950Y(r3)
            b.i.b.h.l.b$b r5 = r0.f3977o0
            r7 = 0
        L_0x0557:
            if (r7 >= r2) goto L_0x05ea
            java.util.ArrayList<b.i.b.h.d> r8 = r0.f3998l0
            java.lang.Object r8 = r8.get(r7)
            b.i.b.h.d r8 = (p009b.p077i.p080b.p081h.C1286d) r8
            boolean r9 = r8 instanceof p009b.p077i.p080b.p081h.C1289f
            if (r9 == 0) goto L_0x0566
            goto L_0x0586
        L_0x0566:
            boolean r9 = r8 instanceof p009b.p077i.p080b.p081h.C1282a
            if (r9 == 0) goto L_0x056b
            goto L_0x0586
        L_0x056b:
            boolean r9 = r8.f3902A
            if (r9 == 0) goto L_0x0570
            goto L_0x0586
        L_0x0570:
            if (r3 == 0) goto L_0x058a
            b.i.b.h.l.k r9 = r8.f3934d
            if (r9 == 0) goto L_0x058a
            b.i.b.h.l.m r10 = r8.f3936e
            if (r10 == 0) goto L_0x058a
            b.i.b.h.l.g r9 = r9.f4061e
            boolean r9 = r9.f4031j
            if (r9 == 0) goto L_0x058a
            b.i.b.h.l.g r9 = r10.f4061e
            boolean r9 = r9.f4031j
            if (r9 == 0) goto L_0x058a
        L_0x0586:
            r9 = r29
            r10 = 0
            goto L_0x05e4
        L_0x058a:
            r9 = 0
            b.i.b.h.d$a r10 = r8.mo3927k(r9)
            r9 = 1
            b.i.b.h.d$a r11 = r8.mo3927k(r9)
            if (r10 != r4) goto L_0x05a2
            int r12 = r8.f3950l
            if (r12 == r9) goto L_0x05a2
            if (r11 != r4) goto L_0x05a2
            int r12 = r8.f3951m
            if (r12 == r9) goto L_0x05a2
            r12 = r9
            goto L_0x05a3
        L_0x05a2:
            r12 = 0
        L_0x05a3:
            if (r12 != 0) goto L_0x05da
            boolean r13 = r0.mo3950Y(r9)
            if (r13 == 0) goto L_0x05da
            boolean r9 = r8 instanceof p009b.p077i.p080b.p081h.C1293j
            if (r9 != 0) goto L_0x05da
            if (r10 != r4) goto L_0x05be
            int r9 = r8.f3950l
            if (r9 != 0) goto L_0x05be
            if (r11 == r4) goto L_0x05be
            boolean r9 = r8.mo3939w()
            if (r9 != 0) goto L_0x05be
            r12 = 1
        L_0x05be:
            if (r11 != r4) goto L_0x05cd
            int r9 = r8.f3951m
            if (r9 != 0) goto L_0x05cd
            if (r10 == r4) goto L_0x05cd
            boolean r9 = r8.mo3939w()
            if (r9 != 0) goto L_0x05cd
            r12 = 1
        L_0x05cd:
            if (r10 == r4) goto L_0x05d1
            if (r11 != r4) goto L_0x05da
        L_0x05d1:
            float r9 = r8.f3920S
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x05db
            r12 = 1
            goto L_0x05db
        L_0x05da:
            r10 = 0
        L_0x05db:
            r9 = r29
            if (r12 == 0) goto L_0x05e0
            goto L_0x05e4
        L_0x05e0:
            r11 = 0
            r9.mo3956a(r5, r8, r11)
        L_0x05e4:
            int r7 = r7 + 1
            r29 = r9
            goto L_0x0557
        L_0x05ea:
            r9 = r29
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = (androidx.constraintlayout.widget.ConstraintLayout.C0089b) r5
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f529a
            int r2 = r2.getChildCount()
            r3 = 0
        L_0x05f5:
            if (r3 >= r2) goto L_0x0609
            androidx.constraintlayout.widget.ConstraintLayout r4 = r5.f529a
            android.view.View r4 = r4.getChildAt(r3)
            boolean r7 = r4 instanceof p009b.p077i.p083c.C1330g
            if (r7 == 0) goto L_0x0606
            b.i.c.g r4 = (p009b.p077i.p083c.C1330g) r4
            r4.mo4035a()
        L_0x0606:
            int r3 = r3 + 1
            goto L_0x05f5
        L_0x0609:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f529a
            java.util.ArrayList<b.i.c.b> r2 = r2.f446d
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0628
            r3 = 0
        L_0x0614:
            if (r3 >= r2) goto L_0x0628
            androidx.constraintlayout.widget.ConstraintLayout r4 = r5.f529a
            java.util.ArrayList<b.i.c.b> r4 = r4.f446d
            java.lang.Object r4 = r4.get(r3)
            b.i.c.b r4 = (p009b.p077i.p083c.C1317b) r4
            r4.mo4006i()
            int r3 = r3 + 1
            goto L_0x0614
        L_0x0626:
            r9 = r29
        L_0x0628:
            r9.mo3958c(r0)
            java.util.ArrayList<b.i.b.h.d> r2 = r9.f3999a
            int r2 = r2.size()
            r3 = r27
            r4 = r28
            if (r6 <= 0) goto L_0x063a
            r9.mo3957b(r0, r3, r4)
        L_0x063a:
            if (r2 <= 0) goto L_0x081e
            b.i.b.h.d$a r5 = r0.mo3929m()
            r6 = r19
            if (r5 != r6) goto L_0x0646
            r5 = 1
            goto L_0x0647
        L_0x0646:
            r5 = 0
        L_0x0647:
            b.i.b.h.d$a r7 = r0.mo3933q()
            if (r7 != r6) goto L_0x064f
            r6 = 1
            goto L_0x0650
        L_0x064f:
            r6 = 0
        L_0x0650:
            int r7 = r0.mo3934r()
            b.i.b.h.e r8 = r9.f4001c
            int r8 = r8.f3925X
            int r7 = java.lang.Math.max(r7, r8)
            int r8 = r0.mo3928l()
            b.i.b.h.e r10 = r9.f4001c
            int r10 = r10.f3926Y
            int r8 = java.lang.Math.max(r8, r10)
            r10 = r7
            r11 = r8
            r7 = 0
            r8 = 0
        L_0x066c:
            if (r7 >= r2) goto L_0x0705
            java.util.ArrayList<b.i.b.h.d> r12 = r9.f3999a
            java.lang.Object r12 = r12.get(r7)
            b.i.b.h.d r12 = (p009b.p077i.p080b.p081h.C1286d) r12
            boolean r13 = r12 instanceof p009b.p077i.p080b.p081h.C1293j
            if (r13 != 0) goto L_0x0685
            r17 = r1
            r14 = r24
            r13 = r25
            r15 = r26
            r1 = 0
            goto L_0x06f9
        L_0x0685:
            int r13 = r12.mo3934r()
            int r14 = r12.mo3928l()
            r17 = r1
            r15 = r26
            r1 = 1
            boolean r18 = r9.mo3956a(r15, r12, r1)
            r1 = r8 | r18
            int r8 = r12.mo3934r()
            r18 = r1
            int r1 = r12.mo3928l()
            if (r8 == r13) goto L_0x06c9
            r12.mo3917M(r8)
            if (r5 == 0) goto L_0x06c4
            int r8 = r12.mo3932p()
            if (r8 <= r10) goto L_0x06c4
            int r8 = r12.mo3932p()
            r13 = r25
            b.i.b.h.c r18 = r12.mo3925i(r13)
            int r18 = r18.mo3898d()
            int r8 = r18 + r8
            int r10 = java.lang.Math.max(r10, r8)
            goto L_0x06c6
        L_0x06c4:
            r13 = r25
        L_0x06c6:
            r18 = 1
            goto L_0x06cb
        L_0x06c9:
            r13 = r25
        L_0x06cb:
            if (r1 == r14) goto L_0x06f2
            r12.mo3912H(r1)
            if (r6 == 0) goto L_0x06ed
            int r1 = r12.mo3926j()
            if (r1 <= r11) goto L_0x06ed
            int r1 = r12.mo3926j()
            r14 = r24
            b.i.b.h.c r8 = r12.mo3925i(r14)
            int r8 = r8.mo3898d()
            int r8 = r8 + r1
            int r1 = java.lang.Math.max(r11, r8)
            r11 = r1
            goto L_0x06ef
        L_0x06ed:
            r14 = r24
        L_0x06ef:
            r18 = 1
            goto L_0x06f4
        L_0x06f2:
            r14 = r24
        L_0x06f4:
            b.i.b.h.j r12 = (p009b.p077i.p080b.p081h.C1293j) r12
            r1 = 0
            r8 = r18 | 0
        L_0x06f9:
            int r7 = r7 + 1
            r25 = r13
            r24 = r14
            r26 = r15
            r1 = r17
            goto L_0x066c
        L_0x0705:
            r17 = r1
            r14 = r24
            r13 = r25
            r15 = r26
            r1 = 0
            r7 = r1
        L_0x070f:
            r12 = 2
            if (r7 >= r12) goto L_0x07f6
            r18 = r8
            r8 = r1
        L_0x0715:
            if (r8 >= r2) goto L_0x07d3
            java.util.ArrayList<b.i.b.h.d> r1 = r9.f3999a
            java.lang.Object r1 = r1.get(r8)
            b.i.b.h.d r1 = (p009b.p077i.p080b.p081h.C1286d) r1
            boolean r12 = r1 instanceof p009b.p077i.p080b.p081h.C1290g
            if (r12 == 0) goto L_0x0727
            boolean r12 = r1 instanceof p009b.p077i.p080b.p081h.C1293j
            if (r12 == 0) goto L_0x072b
        L_0x0727:
            boolean r12 = r1 instanceof p009b.p077i.p080b.p081h.C1289f
            if (r12 == 0) goto L_0x072e
        L_0x072b:
            r19 = r2
            goto L_0x074e
        L_0x072e:
            int r12 = r1.f3933c0
            r19 = r2
            r2 = 8
            if (r12 != r2) goto L_0x0737
            goto L_0x074e
        L_0x0737:
            if (r21 == 0) goto L_0x074a
            b.i.b.h.l.k r2 = r1.f3934d
            b.i.b.h.l.g r2 = r2.f4061e
            boolean r2 = r2.f4031j
            if (r2 == 0) goto L_0x074a
            b.i.b.h.l.m r2 = r1.f3936e
            b.i.b.h.l.g r2 = r2.f4061e
            boolean r2 = r2.f4031j
            if (r2 == 0) goto L_0x074a
            goto L_0x074e
        L_0x074a:
            boolean r2 = r1 instanceof p009b.p077i.p080b.p081h.C1293j
            if (r2 == 0) goto L_0x0756
        L_0x074e:
            r23 = r0
            r27 = r3
            r26 = r15
            goto L_0x07c5
        L_0x0756:
            int r2 = r1.mo3934r()
            int r12 = r1.mo3928l()
            r23 = r0
            int r0 = r1.f3924W
            r27 = r3
            r3 = 1
            if (r7 != r3) goto L_0x0768
            r3 = 2
        L_0x0768:
            boolean r3 = r9.mo3956a(r15, r1, r3)
            r3 = r3 | r18
            r18 = r3
            int r3 = r1.mo3934r()
            r26 = r15
            int r15 = r1.mo3928l()
            if (r3 == r2) goto L_0x079a
            r1.mo3917M(r3)
            if (r5 == 0) goto L_0x0798
            int r2 = r1.mo3932p()
            if (r2 <= r10) goto L_0x0798
            int r2 = r1.mo3932p()
            b.i.b.h.c r3 = r1.mo3925i(r13)
            int r3 = r3.mo3898d()
            int r3 = r3 + r2
            int r10 = java.lang.Math.max(r10, r3)
        L_0x0798:
            r18 = 1
        L_0x079a:
            if (r15 == r12) goto L_0x07bb
            r1.mo3912H(r15)
            if (r6 == 0) goto L_0x07b9
            int r2 = r1.mo3926j()
            if (r2 <= r11) goto L_0x07b9
            int r2 = r1.mo3926j()
            b.i.b.h.c r3 = r1.mo3925i(r14)
            int r3 = r3.mo3898d()
            int r3 = r3 + r2
            int r2 = java.lang.Math.max(r11, r3)
            r11 = r2
        L_0x07b9:
            r18 = 1
        L_0x07bb:
            boolean r2 = r1.f3963y
            if (r2 == 0) goto L_0x07c5
            int r1 = r1.f3924W
            if (r0 == r1) goto L_0x07c5
            r18 = 1
        L_0x07c5:
            int r8 = r8 + 1
            r2 = r19
            r0 = r23
            r15 = r26
            r3 = r27
            r1 = 0
            r12 = 2
            goto L_0x0715
        L_0x07d3:
            r23 = r0
            r19 = r2
            r27 = r3
            r26 = r15
            if (r18 == 0) goto L_0x07ef
            r0 = r23
            r1 = r27
            r9.mo3957b(r0, r1, r4)
            int r7 = r7 + 1
            r3 = r1
            r2 = r19
            r15 = r26
            r1 = 0
            r8 = 0
            goto L_0x070f
        L_0x07ef:
            r0 = r23
            r1 = r27
            r8 = r18
            goto L_0x07f7
        L_0x07f6:
            r1 = r3
        L_0x07f7:
            if (r8 == 0) goto L_0x081c
            r9.mo3957b(r0, r1, r4)
            int r2 = r0.mo3934r()
            if (r2 >= r10) goto L_0x0808
            r0.mo3917M(r10)
            r20 = 1
            goto L_0x080a
        L_0x0808:
            r20 = 0
        L_0x080a:
            int r2 = r0.mo3928l()
            if (r2 >= r11) goto L_0x0815
            r0.mo3912H(r11)
            r3 = 1
            goto L_0x0817
        L_0x0815:
            r3 = r20
        L_0x0817:
            if (r3 == 0) goto L_0x081c
            r9.mo3957b(r0, r1, r4)
        L_0x081c:
            r1 = r17
        L_0x081e:
            r0.mo3951Z(r1)
        L_0x0821:
            r7 = r30
            b.i.b.h.e r0 = r7.f447e
            int r3 = r0.mo3934r()
            b.i.b.h.e r0 = r7.f447e
            int r4 = r0.mo3928l()
            b.i.b.h.e r0 = r7.f447e
            boolean r5 = r0.f3987y0
            boolean r6 = r0.f3988z0
            r0 = r30
            r1 = r31
            r2 = r32
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1286d e = mo597e(view);
        if ((view instanceof Guideline) && !(e instanceof C1289f)) {
            C0087a aVar = (C0087a) view.getLayoutParams();
            C1289f fVar = new C1289f();
            aVar.f513l0 = fVar;
            aVar.f488Y = true;
            fVar.mo3953Q(aVar.f481R);
        }
        if (view instanceof C1317b) {
            C1317b bVar = (C1317b) view;
            bVar.mo4008k();
            ((C0087a) view.getLayoutParams()).f489Z = true;
            if (!this.f446d.contains(bVar)) {
                this.f446d.add(bVar);
            }
        }
        this.f445c.put(view.getId(), view);
        this.f452j = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f445c.remove(view.getId());
        C1286d e = mo597e(view);
        this.f447e.f3998l0.remove(e);
        e.mo3906B();
        this.f446d.remove(view);
        this.f452j = true;
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        this.f452j = true;
        this.f458p = -1;
        this.f459q = -1;
        super.requestLayout();
    }

    public void setConstraintSet(C1321d dVar) {
        this.f454l = dVar;
    }

    public void setId(int i) {
        this.f445c.remove(getId());
        super.setId(i);
        this.f445c.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f451i) {
            this.f451i = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f450h) {
            this.f450h = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f449g) {
            this.f449g = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f448f) {
            this.f448f = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C1329f fVar) {
        C1318c cVar = this.f455m;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f453k = i;
        C1288e eVar = this.f447e;
        eVar.f3986x0 = i;
        C1274d.f3812p = eVar.mo3950Y(512);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f595k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f596a = -1;

    /* renamed from: b */
    public Object f597b;

    /* renamed from: c */
    public byte[] f598c = null;

    /* renamed from: d */
    public Parcelable f599d = null;

    /* renamed from: e */
    public int f600e = 0;

    /* renamed from: f */
    public int f601f = 0;

    /* renamed from: g */
    public ColorStateList f602g = null;

    /* renamed from: h */
    public PorterDuff.Mode f603h = f595k;

    /* renamed from: i */
    public String f604i = null;

    /* renamed from: j */
    public String f605j;

    public IconCompat() {
    }

    public IconCompat(int i) {
        this.f596a = i;
    }

    /* renamed from: a */
    public static Bitmap m251a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m252b(Resources resources, String str, int i) {
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f600e = i;
            iconCompat.f597b = str;
            iconCompat.f605j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: c */
    public int mo747c() {
        int i = this.f596a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f597b;
            if (i2 >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            }
        } else if (i == 2) {
            return this.f600e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    /* renamed from: d */
    public int mo748d() {
        StringBuilder sb;
        int i = this.f596a;
        if (i != -1) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT;
        Icon icon = (Icon) this.f597b;
        if (i2 >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    /* renamed from: e */
    public Uri mo749e() {
        int i = this.f596a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f597b;
            if (i2 >= 28) {
                return icon.getUri();
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            }
        } else if (i == 4 || i == 6) {
            return Uri.parse((String) this.f597b);
        } else {
            throw new IllegalStateException("called getUri() on " + this);
        }
    }

    @Deprecated
    /* renamed from: f */
    public Icon mo750f() {
        return mo751g((Context) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r8 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        r8 = m251a(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0152, code lost:
        r8 = android.graphics.drawable.Icon.createWithBitmap(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0156, code lost:
        r0 = r7.f602g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0158, code lost:
        if (r0 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015a, code lost:
        r8.setTintList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015d, code lost:
        r0 = r7.f603h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0161, code lost:
        if (r0 == f595k) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0163, code lost:
        r8.setTintMode(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0166, code lost:
        return r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon mo751g(android.content.Context r8) {
        /*
            r7 = this;
            int r0 = r7.f596a
            r1 = 26
            r2 = 0
            java.lang.String r3 = "IconCompat"
            r4 = 0
            switch(r0) {
                case -1: goto L_0x0167;
                case 0: goto L_0x000b;
                case 1: goto L_0x014e;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00b3;
                case 6: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r8.<init>(r0)
            throw r8
        L_0x0013:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 < r5) goto L_0x0023
            android.net.Uri r8 = r7.mo749e()
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r8)
            goto L_0x0156
        L_0x0023:
            if (r8 == 0) goto L_0x009c
            android.net.Uri r0 = r7.mo749e()
            java.lang.String r5 = r0.getScheme()
            java.lang.String r6 = "content"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0057
            java.lang.String r6 = "file"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x003e
            goto L_0x0057
        L_0x003e:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004e }
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x004e }
            java.lang.Object r6 = r7.f597b     // Catch:{ FileNotFoundException -> 0x004e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ FileNotFoundException -> 0x004e }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x004e }
            r8.<init>(r5)     // Catch:{ FileNotFoundException -> 0x004e }
            r2 = r8
            goto L_0x0075
        L_0x004e:
            r8 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unable to load image from path: "
            goto L_0x0068
        L_0x0057:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x0060 }
            java.io.InputStream r2 = r8.openInputStream(r0)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0075
        L_0x0060:
            r8 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unable to load image from URI: "
        L_0x0068:
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r3, r0, r8)
        L_0x0075:
            if (r2 == 0) goto L_0x0085
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r1) goto L_0x0080
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r2)
            goto L_0x00bb
        L_0x0080:
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r2)
            goto L_0x00c5
        L_0x0085:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot load adaptive icon from uri: "
            java.lang.StringBuilder r0 = p133c.p149b.p152b.p153a.C2108a.m5005o(r0)
            android.net.Uri r1 = r7.mo749e()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x009c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
            java.lang.StringBuilder r0 = p133c.p149b.p152b.p153a.C2108a.m5005o(r0)
            android.net.Uri r1 = r7.mo749e()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00b3:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r1) goto L_0x00c1
            java.lang.Object r8 = r7.f597b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        L_0x00bb:
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r8)
            goto L_0x0156
        L_0x00c1:
            java.lang.Object r8 = r7.f597b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        L_0x00c5:
            android.graphics.Bitmap r8 = m251a(r8, r4)
            goto L_0x0152
        L_0x00cb:
            java.lang.Object r8 = r7.f597b
            java.lang.String r8 = (java.lang.String) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithContentUri(r8)
            goto L_0x0156
        L_0x00d5:
            java.lang.Object r8 = r7.f597b
            byte[] r8 = (byte[]) r8
            int r0 = r7.f600e
            int r1 = r7.f601f
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithData(r8, r0, r1)
            goto L_0x0156
        L_0x00e3:
            r8 = -1
            if (r0 != r8) goto L_0x0116
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r0 = r7.f597b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            r1 = 28
            if (r8 < r1) goto L_0x00f5
            java.lang.String r2 = r0.getResPackage()
            goto L_0x0130
        L_0x00f5:
            java.lang.Class r8 = r0.getClass()     // Catch:{ IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d, NoSuchMethodException -> 0x010b }
            java.lang.String r1 = "getResPackage"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d, NoSuchMethodException -> 0x010b }
            java.lang.reflect.Method r8 = r8.getMethod(r1, r5)     // Catch:{ IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d, NoSuchMethodException -> 0x010b }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d, NoSuchMethodException -> 0x010b }
            java.lang.Object r8 = r8.invoke(r0, r1)     // Catch:{ IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d, NoSuchMethodException -> 0x010b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalAccessException -> 0x010f, InvocationTargetException -> 0x010d, NoSuchMethodException -> 0x010b }
            r2 = r8
            goto L_0x0130
        L_0x010b:
            r8 = move-exception
            goto L_0x0110
        L_0x010d:
            r8 = move-exception
            goto L_0x0110
        L_0x010f:
            r8 = move-exception
        L_0x0110:
            java.lang.String r0 = "Unable to get icon package"
            android.util.Log.e(r3, r0, r8)
            goto L_0x0130
        L_0x0116:
            r1 = 2
            if (r0 != r1) goto L_0x0137
            java.lang.String r0 = r7.f605j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r7.f597b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ":"
            java.lang.String[] r8 = r0.split(r1, r8)
            r2 = r8[r4]
            goto L_0x0130
        L_0x012e:
            java.lang.String r2 = r7.f605j
        L_0x0130:
            int r8 = r7.f600e
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithResource(r2, r8)
            goto L_0x0156
        L_0x0137:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "called getResPackage() on "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x014e:
            java.lang.Object r8 = r7.f597b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        L_0x0152:
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
        L_0x0156:
            android.content.res.ColorStateList r0 = r7.f602g
            if (r0 == 0) goto L_0x015d
            r8.setTintList(r0)
        L_0x015d:
            android.graphics.PorterDuff$Mode r0 = r7.f603h
            android.graphics.PorterDuff$Mode r1 = f595k
            if (r0 == r1) goto L_0x0166
            r8.setTintMode(r0)
        L_0x0166:
            return r8
        L_0x0167:
            java.lang.Object r8 = r7.f597b
            android.graphics.drawable.Icon r8 = (android.graphics.drawable.Icon) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.mo751g(android.content.Context):android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f596a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f597b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f596a
            switch(r1) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0024;
                case 4: goto L_0x0021;
                case 5: goto L_0x001e;
                case 6: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L_0x002c
        L_0x001e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "URI"
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "DATA"
            goto L_0x002c
        L_0x0027:
            java.lang.String r1 = "RESOURCE"
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = "BITMAP"
        L_0x002c:
            r0.append(r1)
            int r1 = r4.f596a
            switch(r1) {
                case 1: goto L_0x007d;
                case 2: goto L_0x0056;
                case 3: goto L_0x0040;
                case 4: goto L_0x0035;
                case 5: goto L_0x007d;
                case 6: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x009d
        L_0x0035:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f597b
            r0.append(r1)
            goto L_0x009d
        L_0x0040:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f600e
            r0.append(r1)
            int r1 = r4.f601f
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f601f
            goto L_0x009a
        L_0x0056:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f605j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.mo747c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009d
        L_0x007d:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f597b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f597b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x009a:
            r0.append(r1)
        L_0x009d:
            android.content.res.ColorStateList r1 = r4.f602g
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f602g
            r0.append(r1)
        L_0x00ab:
            android.graphics.PorterDuff$Mode r1 = r4.f603h
            android.graphics.PorterDuff$Mode r2 = f595k
            if (r1 == r2) goto L_0x00bb
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f603h
            r0.append(r1)
        L_0x00bb:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}

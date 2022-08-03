package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p017b.C0220a;
import p009b.p017b.C0221b;
import p009b.p017b.p024g.C0284b;
import p009b.p017b.p026h.C0358d;
import p009b.p017b.p026h.C0363e1;
import p009b.p017b.p026h.C0379j0;
import p009b.p017b.p026h.C0412s0;
import p009b.p017b.p026h.C0436y0;
import p009b.p086k.p098j.C1496p;
import p009b.p102l.p103a.C1521a;
import p009b.p104m.p105a.C1527a;
import p133c.p149b.p152b.p153a.C2108a;

public class SearchView extends C0379j0 implements C0284b {

    /* renamed from: s0 */
    public static final C0067n f264s0 = (Build.VERSION.SDK_INT < 29 ? new C0067n() : null);

    /* renamed from: A */
    public C0070p f265A;

    /* renamed from: B */
    public Rect f266B;

    /* renamed from: C */
    public Rect f267C;

    /* renamed from: D */
    public int[] f268D;

    /* renamed from: E */
    public int[] f269E;

    /* renamed from: F */
    public final ImageView f270F;

    /* renamed from: G */
    public final Drawable f271G;

    /* renamed from: H */
    public final int f272H;

    /* renamed from: I */
    public final int f273I;

    /* renamed from: J */
    public final Intent f274J;

    /* renamed from: K */
    public final Intent f275K;

    /* renamed from: L */
    public final CharSequence f276L;

    /* renamed from: M */
    public C0065l f277M;

    /* renamed from: N */
    public C0064k f278N;

    /* renamed from: O */
    public View.OnFocusChangeListener f279O;

    /* renamed from: P */
    public C0066m f280P;

    /* renamed from: Q */
    public View.OnClickListener f281Q;

    /* renamed from: R */
    public boolean f282R;

    /* renamed from: S */
    public boolean f283S;

    /* renamed from: T */
    public C1521a f284T;

    /* renamed from: U */
    public boolean f285U;

    /* renamed from: V */
    public CharSequence f286V;

    /* renamed from: W */
    public boolean f287W;

    /* renamed from: a0 */
    public boolean f288a0;

    /* renamed from: b0 */
    public int f289b0;

    /* renamed from: c0 */
    public boolean f290c0;

    /* renamed from: d0 */
    public CharSequence f291d0;

    /* renamed from: e0 */
    public CharSequence f292e0;

    /* renamed from: f0 */
    public boolean f293f0;

    /* renamed from: g0 */
    public int f294g0;

    /* renamed from: h0 */
    public SearchableInfo f295h0;

    /* renamed from: i0 */
    public Bundle f296i0;

    /* renamed from: j0 */
    public final Runnable f297j0;

    /* renamed from: k0 */
    public Runnable f298k0;

    /* renamed from: l0 */
    public final WeakHashMap<String, Drawable.ConstantState> f299l0;

    /* renamed from: m0 */
    public final View.OnClickListener f300m0;

    /* renamed from: n0 */
    public View.OnKeyListener f301n0;

    /* renamed from: o0 */
    public final TextView.OnEditorActionListener f302o0;

    /* renamed from: p0 */
    public final AdapterView.OnItemClickListener f303p0;

    /* renamed from: q0 */
    public final AdapterView.OnItemSelectedListener f304q0;

    /* renamed from: r */
    public final SearchAutoComplete f305r;

    /* renamed from: r0 */
    public TextWatcher f306r0;

    /* renamed from: s */
    public final View f307s;

    /* renamed from: t */
    public final View f308t;

    /* renamed from: u */
    public final View f309u;

    /* renamed from: v */
    public final ImageView f310v;

    /* renamed from: w */
    public final ImageView f311w;

    /* renamed from: x */
    public final ImageView f312x;

    /* renamed from: y */
    public final ImageView f313y;

    /* renamed from: z */
    public final View f314z;

    public static class SearchAutoComplete extends C0358d {

        /* renamed from: f */
        public int f315f = getThreshold();

        /* renamed from: g */
        public SearchView f316g;

        /* renamed from: h */
        public boolean f317h;

        /* renamed from: i */
        public final Runnable f318i = new C0053a();

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C0053a implements Runnable {
            public C0053a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f317h) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f317h = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public void mo355a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0067n nVar = SearchView.f264s0;
            Objects.requireNonNull(nVar);
            C0067n.m119a();
            Method method = nVar.f332c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.f315f <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f317h) {
                removeCallbacks(this.f318i);
                post(this.f318i);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f316g;
            searchView.mo311G(searchView.f283S);
            searchView.post(searchView.f297j0);
            if (searchView.f305r.hasFocus()) {
                searchView.mo331s();
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f316g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f316g.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.f317h = true;
                Context context = getContext();
                C0067n nVar = SearchView.f264s0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    mo355a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f317h = false;
                removeCallbacks(this.f318i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f317h = false;
                removeCallbacks(this.f318i);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f317h = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f316g = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f315f = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0054a implements TextWatcher {
        public C0054a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f305r.getText();
            searchView.f292e0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.mo310F(z);
            searchView.mo312H(!z);
            searchView.mo306B();
            searchView.mo309E();
            if (searchView.f277M != null && !TextUtils.equals(charSequence, searchView.f291d0)) {
                searchView.f277M.mo382a(charSequence.toString());
            }
            searchView.f291d0 = charSequence.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C0055b implements Runnable {
        public C0055b() {
        }

        public void run() {
            SearchView.this.mo307C();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C0056c implements Runnable {
        public C0056c() {
        }

        public void run() {
            C1521a aVar = SearchView.this.f284T;
            if (aVar instanceof C0412s0) {
                aVar.mo2544b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C0057d implements View.OnFocusChangeListener {
        public C0057d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f279O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C0058e implements View.OnLayoutChangeListener {
        public C0058e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.f314z.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f308t.getPaddingLeft();
                Rect rect = new Rect();
                boolean b = C0363e1.m1405b(searchView);
                int dimensionPixelSize = searchView.f282R ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.f305r.getDropDownBackground().getPadding(rect);
                searchView.f305r.setDropDownHorizontalOffset(b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f305r.setDropDownWidth((((searchView.f314z.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C0059f implements View.OnClickListener {
        public C0059f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f310v) {
                searchView.mo353y();
            } else if (view == searchView.f312x) {
                searchView.mo349u();
            } else if (view == searchView.f311w) {
                searchView.mo354z();
            } else if (view == searchView.f313y) {
                SearchableInfo searchableInfo = searchView.f295h0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.f274J);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.mo329r(searchView.f275K, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.f305r) {
                searchView.mo331s();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C0060g implements View.OnKeyListener {
        public C0060g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f295h0 == null) {
                return false;
            }
            if (searchView.f305r.isPopupShowing() && SearchView.this.f305r.getListSelection() != -1) {
                return SearchView.this.mo305A(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.f305r.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo348t(0, (String) null, searchView2.f305r.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0061h implements TextView.OnEditorActionListener {
        public C0061h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo354z();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0062i implements AdapterView.OnItemClickListener {
        public C0062i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo350v(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0063j implements AdapterView.OnItemSelectedListener {
        public C0063j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo351w(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0064k {
        /* renamed from: a */
        boolean mo381a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0065l {
        /* renamed from: a */
        boolean mo382a(String str);

        /* renamed from: b */
        boolean mo383b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0066m {
        /* renamed from: a */
        boolean mo384a(int i);

        /* renamed from: b */
        boolean mo385b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public static class C0067n {

        /* renamed from: a */
        public Method f330a = null;

        /* renamed from: b */
        public Method f331b = null;

        /* renamed from: c */
        public Method f332c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0067n() {
            m119a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f330a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f331b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f332c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public static void m119a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0068o extends C1527a {
        public static final Parcelable.Creator<C0068o> CREATOR = new C0069a();

        /* renamed from: e */
        public boolean f333e;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        public class C0069a implements Parcelable.ClassLoaderCreator<C0068o> {
            public Object createFromParcel(Parcel parcel) {
                return new C0068o(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0068o[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0068o(parcel, classLoader);
            }
        }

        public C0068o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f333e = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public C0068o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder o = C2108a.m5005o("SearchView.SavedState{");
            o.append(Integer.toHexString(System.identityHashCode(this)));
            o.append(" isIconified=");
            o.append(this.f333e);
            o.append("}");
            return o.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4660c, i);
            parcel.writeValue(Boolean.valueOf(this.f333e));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0070p extends TouchDelegate {

        /* renamed from: a */
        public final View f334a;

        /* renamed from: b */
        public final Rect f335b = new Rect();

        /* renamed from: c */
        public final Rect f336c = new Rect();

        /* renamed from: d */
        public final Rect f337d = new Rect();

        /* renamed from: e */
        public final int f338e;

        /* renamed from: f */
        public boolean f339f;

        public C0070p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f338e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo391a(rect, rect2);
            this.f334a = view;
        }

        /* renamed from: a */
        public void mo391a(Rect rect, Rect rect2) {
            this.f335b.set(rect);
            this.f337d.set(rect);
            Rect rect3 = this.f337d;
            int i = this.f338e;
            rect3.inset(-i, -i);
            this.f336c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f339f
                r8.f339f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f339f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f337d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f335b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f339f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x005d
                android.graphics.Rect r2 = r8.f336c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005d
                android.view.View r0 = r8.f334a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f334a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0066
            L_0x005d:
                android.graphics.Rect r2 = r8.f336c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0066:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r0 = r8.f334a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0070p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        this.f266B = new Rect();
        this.f267C = new Rect();
        this.f268D = new int[2];
        this.f269E = new int[2];
        this.f297j0 = new C0055b();
        this.f298k0 = new C0056c();
        this.f299l0 = new WeakHashMap<>();
        C0059f fVar = new C0059f();
        this.f300m0 = fVar;
        this.f301n0 = new C0060g();
        C0061h hVar = new C0061h();
        this.f302o0 = hVar;
        C0062i iVar = new C0062i();
        this.f303p0 = iVar;
        C0063j jVar = new C0063j();
        this.f304q0 = jVar;
        this.f306r0 = new C0054a();
        C0436y0 y0Var = new C0436y0(context2, context2.obtainStyledAttributes(attributeSet, C0221b.f1174t, i, 0));
        LayoutInflater.from(context).inflate(y0Var.mo2656m(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f305r = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f307s = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f308t = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f309u = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f310v = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f311w = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f312x = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f313y = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f270F = imageView5;
        Drawable g = y0Var.mo2650g(10);
        AtomicInteger atomicInteger = C1496p.f4584a;
        findViewById.setBackground(g);
        findViewById2.setBackground(y0Var.mo2650g(14));
        imageView.setImageDrawable(y0Var.mo2650g(13));
        imageView2.setImageDrawable(y0Var.mo2650g(7));
        imageView3.setImageDrawable(y0Var.mo2650g(4));
        imageView4.setImageDrawable(y0Var.mo2650g(16));
        imageView5.setImageDrawable(y0Var.mo2650g(13));
        this.f271G = y0Var.mo2650g(12);
        C0220a.m867r(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f272H = y0Var.mo2656m(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f273I = y0Var.mo2656m(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f306r0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f301n0);
        searchAutoComplete.setOnFocusChangeListener(new C0057d());
        setIconifiedByDefault(y0Var.mo2644a(8, true));
        int f = y0Var.mo2649f(1, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f276L = y0Var.mo2658o(6);
        this.f286V = y0Var.mo2658o(11);
        int j = y0Var.mo2653j(3, -1);
        if (j != -1) {
            setImeOptions(j);
        }
        int j2 = y0Var.mo2653j(2, -1);
        if (j2 != -1) {
            setInputType(j2);
        }
        setFocusable(y0Var.mo2644a(0, true));
        y0Var.f2015b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f274J = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f275K = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f314z = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0058e());
        }
        mo311G(this.f282R);
        mo308D();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f305r.setText(charSequence);
        this.f305r.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public boolean mo305A(int i, KeyEvent keyEvent) {
        if (this.f295h0 != null && this.f284T != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo350v(this.f305r.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f305r.setSelection(i == 21 ? 0 : this.f305r.length());
                this.f305r.setListSelection(0);
                this.f305r.clearListSelection();
                this.f305r.mo355a();
                return true;
            } else if (i != 19 || this.f305r.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void mo306B() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f305r.getText());
        int i = 0;
        if (!z2 && (!this.f282R || this.f293f0)) {
            z = false;
        }
        ImageView imageView = this.f312x;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f312x.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: C */
    public void mo307C() {
        int[] iArr = this.f305r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f308t.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f309u.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: D */
    public final void mo308D() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f305r;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f282R && this.f271G != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.f271G.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f271G), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: E */
    public final void mo309E() {
        int i = 0;
        if (!((this.f285U || this.f290c0) && !this.f283S) || !(this.f311w.getVisibility() == 0 || this.f313y.getVisibility() == 0)) {
            i = 8;
        }
        this.f309u.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f290c0 == false) goto L_0x0023;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo310F(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f285U
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f290c0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f283S
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f290c0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.f311w
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo310F(boolean):void");
    }

    /* renamed from: G */
    public final void mo311G(boolean z) {
        this.f283S = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f305r.getText());
        this.f310v.setVisibility(i2);
        mo310F(z2);
        this.f307s.setVisibility(z ? 8 : 0);
        if (this.f270F.getDrawable() == null || this.f282R) {
            i = 8;
        }
        this.f270F.setVisibility(i);
        mo306B();
        mo312H(!z2);
        mo309E();
    }

    /* renamed from: H */
    public final void mo312H(boolean z) {
        int i = 8;
        if (this.f290c0 && !this.f283S && z) {
            this.f311w.setVisibility(8);
            i = 0;
        }
        this.f313y.setVisibility(i);
    }

    /* renamed from: c */
    public void mo313c() {
        if (!this.f293f0) {
            this.f293f0 = true;
            int imeOptions = this.f305r.getImeOptions();
            this.f294g0 = imeOptions;
            this.f305r.setImeOptions(imeOptions | 33554432);
            this.f305r.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f288a0 = true;
        super.clearFocus();
        this.f305r.clearFocus();
        this.f305r.setImeVisibility(false);
        this.f288a0 = false;
    }

    /* renamed from: e */
    public void mo315e() {
        this.f305r.setText("");
        SearchAutoComplete searchAutoComplete = this.f305r;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f292e0 = "";
        clearFocus();
        mo311G(true);
        this.f305r.setImeOptions(this.f294g0);
        this.f293f0 = false;
    }

    public int getImeOptions() {
        return this.f305r.getImeOptions();
    }

    public int getInputType() {
        return this.f305r.getInputType();
    }

    public int getMaxWidth() {
        return this.f289b0;
    }

    public CharSequence getQuery() {
        return this.f305r.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f286V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f295h0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f276L : getContext().getText(this.f295h0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f273I;
    }

    public int getSuggestionRowLayout() {
        return this.f272H;
    }

    public C1521a getSuggestionsAdapter() {
        return this.f284T;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f297j0);
        post(this.f298k0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f305r;
            Rect rect = this.f266B;
            searchAutoComplete.getLocationInWindow(this.f268D);
            getLocationInWindow(this.f269E);
            int[] iArr = this.f268D;
            int i5 = iArr[1];
            int[] iArr2 = this.f269E;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f267C;
            Rect rect3 = this.f266B;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0070p pVar = this.f265A;
            if (pVar == null) {
                C0070p pVar2 = new C0070p(this.f267C, this.f266B, this.f305r);
                this.f265A = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo391a(this.f267C, this.f266B);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f283S
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.f289b0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.f289b0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.f289b0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0068o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0068o oVar = (C0068o) parcelable;
        super.onRestoreInstanceState(oVar.f4660c);
        mo311G(oVar.f333e);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0068o oVar = new C0068o(super.onSaveInstanceState());
        oVar.f333e = this.f283S;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f297j0);
    }

    /* renamed from: q */
    public final Intent mo328q(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f292e0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f296i0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f295h0.getSearchActivity());
        return intent;
    }

    /* renamed from: r */
    public final Intent mo329r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f296i0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f288a0 || !isFocusable()) {
            return false;
        }
        if (this.f283S) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f305r.requestFocus(i, rect);
        if (requestFocus) {
            mo311G(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public void mo331s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f305r.refreshAutoCompleteResults();
            return;
        }
        C0067n nVar = f264s0;
        SearchAutoComplete searchAutoComplete = this.f305r;
        Objects.requireNonNull(nVar);
        C0067n.m119a();
        Method method = nVar.f330a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0067n nVar2 = f264s0;
        SearchAutoComplete searchAutoComplete2 = this.f305r;
        Objects.requireNonNull(nVar2);
        C0067n.m119a();
        Method method2 = nVar2.f331b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f296i0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo349u();
        } else {
            mo353y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f282R != z) {
            this.f282R = z;
            mo311G(z);
            mo308D();
        }
    }

    public void setImeOptions(int i) {
        this.f305r.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f305r.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f289b0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0064k kVar) {
        this.f278N = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f279O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0065l lVar) {
        this.f277M = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f281Q = onClickListener;
    }

    public void setOnSuggestionListener(C0066m mVar) {
        this.f280P = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f286V = charSequence;
        mo308D();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f287W = z;
        C1521a aVar = this.f284T;
        if (aVar instanceof C0412s0) {
            ((C0412s0) aVar).f1935s = z ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f295h0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f305r
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f305r
            android.app.SearchableInfo r3 = r6.f295h0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f295h0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f295h0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f305r
            r3.setInputType(r7)
            b.l.a.a r7 = r6.f284T
            if (r7 == 0) goto L_0x0042
            r7.mo2544b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f295h0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            b.b.h.s0 r7 = new b.b.h.s0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f295h0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f299l0
            r7.<init>(r3, r6, r4, r5)
            r6.f284T = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f305r
            r3.setAdapter(r7)
            b.l.a.a r7 = r6.f284T
            b.b.h.s0 r7 = (p009b.p017b.p026h.C0412s0) r7
            boolean r3 = r6.f287W
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.f1935s = r3
        L_0x006b:
            r6.mo308D()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f295h0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f295h0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.f274J
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f295h0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.f275K
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.f290c0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f305r
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f283S
            r6.mo311G(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f285U = z;
        mo311G(this.f283S);
    }

    public void setSuggestionsAdapter(C1521a aVar) {
        this.f284T = aVar;
        this.f305r.setAdapter(aVar);
    }

    /* renamed from: t */
    public void mo348t(int i, String str, String str2) {
        getContext().startActivity(mo328q("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, (String) null));
    }

    /* renamed from: u */
    public void mo349u() {
        if (!TextUtils.isEmpty(this.f305r.getText())) {
            this.f305r.setText("");
            this.f305r.requestFocus();
            this.f305r.setImeVisibility(true);
        } else if (this.f282R) {
            C0064k kVar = this.f278N;
            if (kVar == null || !kVar.mo381a()) {
                clearFocus();
                mo311G(true);
            }
        }
    }

    /* renamed from: v */
    public boolean mo350v(int i) {
        int i2;
        String m;
        C0066m mVar = this.f280P;
        if (mVar != null && mVar.mo385b(i)) {
            return false;
        }
        Cursor cursor = this.f284T.f4647e;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = C0412s0.f1929A;
                String m2 = C0412s0.m1487m(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (m2 == null) {
                    m2 = this.f295h0.getSuggestIntentAction();
                }
                if (m2 == null) {
                    m2 = "android.intent.action.SEARCH";
                }
                String str = m2;
                String m3 = C0412s0.m1487m(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (m3 == null) {
                    m3 = this.f295h0.getSuggestIntentData();
                }
                if (!(m3 == null || (m = C0412s0.m1487m(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    m3 = m3 + "/" + Uri.encode(m);
                }
                intent = mo328q(str, m3 == null ? null : Uri.parse(m3), C0412s0.m1487m(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), C0412s0.m1487m(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, (String) null);
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        this.f305r.setImeVisibility(false);
        this.f305r.dismissDropDown();
        return true;
    }

    /* renamed from: w */
    public boolean mo351w(int i) {
        CharSequence c;
        C0066m mVar = this.f280P;
        if (mVar != null && mVar.mo384a(i)) {
            return false;
        }
        Editable text = this.f305r.getText();
        Cursor cursor = this.f284T.f4647e;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i) || (c = this.f284T.mo2545c(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(c);
        return true;
    }

    /* renamed from: x */
    public void mo352x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: y */
    public void mo353y() {
        mo311G(false);
        this.f305r.requestFocus();
        this.f305r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f281Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: z */
    public void mo354z() {
        Editable text = this.f305r.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0065l lVar = this.f277M;
            if (lVar == null || !lVar.mo383b(text.toString())) {
                if (this.f295h0 != null) {
                    mo348t(0, (String) null, text.toString());
                }
                this.f305r.setImeVisibility(false);
                this.f305r.dismissDropDown();
            }
        }
    }
}

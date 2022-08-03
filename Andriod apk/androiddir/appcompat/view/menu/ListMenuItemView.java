package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p017b.C0221b;
import p009b.p017b.p024g.p025i.C0311i;
import p009b.p017b.p024g.p025i.C0324n;
import p009b.p017b.p026h.C0436y0;
import p009b.p086k.p098j.C1496p;

public class ListMenuItemView extends LinearLayout implements C0324n.C0325a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: c */
    public C0311i f155c;

    /* renamed from: d */
    public ImageView f156d;

    /* renamed from: e */
    public RadioButton f157e;

    /* renamed from: f */
    public TextView f158f;

    /* renamed from: g */
    public CheckBox f159g;

    /* renamed from: h */
    public TextView f160h;

    /* renamed from: i */
    public ImageView f161i;

    /* renamed from: j */
    public ImageView f162j;

    /* renamed from: k */
    public LinearLayout f163k;

    /* renamed from: l */
    public Drawable f164l;

    /* renamed from: m */
    public int f165m;

    /* renamed from: n */
    public Context f166n;

    /* renamed from: o */
    public boolean f167o;

    /* renamed from: p */
    public Drawable f168p;

    /* renamed from: q */
    public boolean f169q;

    /* renamed from: r */
    public LayoutInflater f170r;

    /* renamed from: s */
    public boolean f171s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0436y0 r = C0436y0.m1555r(getContext(), attributeSet, C0221b.f1171q, R.attr.listMenuViewStyle, 0);
        this.f164l = r.mo2650g(5);
        this.f165m = r.mo2656m(1, -1);
        this.f167o = r.mo2644a(7, false);
        this.f166n = context;
        this.f168p = r.mo2650g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f169q = obtainStyledAttributes.hasValue(0);
        r.f2015b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f170r == null) {
            this.f170r = LayoutInflater.from(getContext());
        }
        return this.f170r;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f161i;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo129a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f159g = checkBox;
        LinearLayout linearLayout = this.f163k;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f162j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f162j.getLayoutParams();
            rect.top = this.f162j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* renamed from: b */
    public final void mo131b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f157e = radioButton;
        LinearLayout linearLayout = this.f163k;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* renamed from: c */
    public void mo132c(boolean z) {
        String str;
        int i;
        int i2 = (!z || !this.f155c.mo2034n()) ? 8 : 0;
        if (i2 == 0) {
            TextView textView = this.f160h;
            C0311i iVar = this.f155c;
            char e = iVar.mo2008e();
            if (e == 0) {
                str = "";
            } else {
                Resources resources = iVar.f1607n.f1563a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar.f1607n.f1563a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = iVar.f1607n.mo1981n() ? iVar.f1604k : iVar.f1602i;
                C0311i.m1200c(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                C0311i.m1200c(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                C0311i.m1200c(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                C0311i.m1200c(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                C0311i.m1200c(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                C0311i.m1200c(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e == 8) {
                    i = R.string.abc_menu_delete_shortcut_label;
                } else if (e == 10) {
                    i = R.string.abc_menu_enter_shortcut_label;
                } else if (e != ' ') {
                    sb.append(e);
                    str = sb.toString();
                } else {
                    i = R.string.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f160h.getVisibility() != i2) {
            this.f160h.setVisibility(i2);
        }
    }

    /* renamed from: d */
    public void mo104d(C0311i iVar, int i) {
        this.f155c = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.f1598e);
        setCheckable(iVar.isCheckable());
        boolean n = iVar.mo2034n();
        iVar.mo2008e();
        mo132c(n);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.f1610q);
    }

    public C0311i getItemData() {
        return this.f155c;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f164l;
        AtomicInteger atomicInteger = C1496p.f4584a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f158f = textView;
        int i = this.f165m;
        if (i != -1) {
            textView.setTextAppearance(this.f166n, i);
        }
        this.f160h = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f161i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f168p);
        }
        this.f162j = (ImageView) findViewById(R.id.group_divider);
        this.f163k = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.f156d != null && this.f167o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f156d.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f157e != null || this.f159g != null) {
            if (this.f155c.mo2023h()) {
                if (this.f157e == null) {
                    mo131b();
                }
                compoundButton2 = this.f157e;
                compoundButton = this.f159g;
            } else {
                if (this.f159g == null) {
                    mo129a();
                }
                compoundButton2 = this.f159g;
                compoundButton = this.f157e;
            }
            if (z) {
                compoundButton2.setChecked(this.f155c.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f159g;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f157e;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f155c.mo2023h()) {
            if (this.f157e == null) {
                mo131b();
            }
            compoundButton = this.f157e;
        } else {
            if (this.f159g == null) {
                mo129a();
            }
            compoundButton = this.f159g;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f171s = z;
        this.f167o = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f162j;
        if (imageView != null) {
            imageView.setVisibility((this.f169q || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f155c.f1607n);
        boolean z = this.f171s;
        if (z || this.f167o) {
            ImageView imageView = this.f156d;
            if (imageView != null || drawable != null || this.f167o) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f156d = imageView2;
                    LinearLayout linearLayout = this.f163k;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f167o) {
                    ImageView imageView3 = this.f156d;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f156d.getVisibility() != 0) {
                        this.f156d.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f156d.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f158f.setText(charSequence);
            if (this.f158f.getVisibility() != 0) {
                textView = this.f158f;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f158f.getVisibility() != 8) {
                textView = this.f158f;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}

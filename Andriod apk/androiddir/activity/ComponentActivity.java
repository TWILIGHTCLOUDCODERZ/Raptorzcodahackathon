package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.webtonative.app86kLsmSxSB340ejDICTA.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.p010a.C0183e;
import p009b.p010a.p011f.C0184a;
import p009b.p010a.p011f.C0185b;
import p009b.p010a.p012g.C0190d;
import p009b.p010a.p012g.C0194e;
import p009b.p086k.p087b.C1347f;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;
import p009b.p114q.C1667h;
import p009b.p114q.C1678q;
import p009b.p114q.C1686w;
import p009b.p114q.C1687x;
import p009b.p121u.C1716a;
import p009b.p126w.C1793a;
import p009b.p126w.C1796b;
import p009b.p126w.C1797c;

public class ComponentActivity extends C1347f implements C1666g, C1687x, C1797c, C0183e, C0194e {

    /* renamed from: d */
    public final C0184a f48d = new C0184a();

    /* renamed from: e */
    public final C1667h f49e;

    /* renamed from: f */
    public final C1796b f50f;

    /* renamed from: g */
    public C1686w f51g;

    /* renamed from: h */
    public final OnBackPressedDispatcher f52h;

    /* renamed from: i */
    public final C0190d f53i;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0029a implements Runnable {
        public C0029a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0030b extends C0190d {
        public C0030b() {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public class C0031c implements C1793a.C1795b {
        public C0031c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public Bundle mo91a() {
            Bundle bundle = new Bundle();
            C0190d dVar = ComponentActivity.this.f53i;
            Objects.requireNonNull(dVar);
            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(dVar.f1036c.values()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(dVar.f1036c.keySet()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(dVar.f1038e));
            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) dVar.f1041h.clone());
            bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", dVar.f1034a);
            return bundle;
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    public class C0032d implements C0185b {
        public C0032d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo92a(Context context) {
            Bundle a = ComponentActivity.this.f50f.f5477b.mo5006a("android:support:activity-result");
            if (a != null) {
                C0190d dVar = ComponentActivity.this.f53i;
                Objects.requireNonNull(dVar);
                ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList != null && integerArrayList != null) {
                    dVar.f1038e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    dVar.f1034a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    dVar.f1041h.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                    for (int i = 0; i < stringArrayList.size(); i++) {
                        String str = stringArrayList.get(i);
                        if (dVar.f1036c.containsKey(str)) {
                            Integer remove = dVar.f1036c.remove(str);
                            if (!dVar.f1041h.containsKey(str)) {
                                dVar.f1035b.remove(remove);
                            }
                        }
                        int intValue = integerArrayList.get(i).intValue();
                        String str2 = stringArrayList.get(i);
                        dVar.f1035b.put(Integer.valueOf(intValue), str2);
                        dVar.f1036c.put(str2, Integer.valueOf(intValue));
                    }
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    public static final class C0033e {

        /* renamed from: a */
        public C1686w f61a;
    }

    public ComponentActivity() {
        C1667h hVar = new C1667h(this);
        this.f49e = hVar;
        C1796b bVar = new C1796b(this);
        this.f50f = bVar;
        this.f52h = new OnBackPressedDispatcher(new C0029a());
        new AtomicInteger();
        this.f53i = new C0030b();
        if (hVar != null) {
            int i = Build.VERSION.SDK_INT;
            hVar.mo4768a(new C1664e() {
                /* renamed from: j */
                public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
                    if (aVar == C1661d.C1662a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            hVar.mo4768a(new C1664e() {
                /* renamed from: j */
                public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
                    if (aVar == C1661d.C1662a.ON_DESTROY) {
                        ComponentActivity.this.f48d.f1031b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.mo71i().mo4804a();
                        }
                    }
                }
            });
            hVar.mo4768a(new C1664e() {
                /* renamed from: j */
                public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
                    ComponentActivity.this.mo73m();
                    C1667h hVar = ComponentActivity.this.f49e;
                    hVar.mo4771c("removeObserver");
                    hVar.f5112a.mo2693p(this);
                }
            });
            if (i <= 23) {
                hVar.mo4768a(new ImmLeaksCleaner(this));
            }
            bVar.f5477b.mo5007b("android:support:activity-result", new C0031c());
            mo72l(new C0032d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        mo74n();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public C1661d mo67b() {
        return this.f49e;
    }

    /* renamed from: c */
    public final OnBackPressedDispatcher mo68c() {
        return this.f52h;
    }

    /* renamed from: d */
    public final C1793a mo69d() {
        return this.f50f.f5477b;
    }

    /* renamed from: h */
    public final C0190d mo70h() {
        return this.f53i;
    }

    /* renamed from: i */
    public C1686w mo71i() {
        if (getApplication() != null) {
            mo73m();
            return this.f51g;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: l */
    public final void mo72l(C0185b bVar) {
        C0184a aVar = this.f48d;
        if (aVar.f1031b != null) {
            bVar.mo92a(aVar.f1031b);
        }
        aVar.f1030a.add(bVar);
    }

    /* renamed from: m */
    public void mo73m() {
        if (this.f51g == null) {
            C0033e eVar = (C0033e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f51g = eVar.f61a;
            }
            if (this.f51g == null) {
                this.f51g = new C1686w();
            }
        }
    }

    /* renamed from: n */
    public final void mo74n() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f53i.mo1401a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f52h.mo93a();
    }

    public void onCreate(Bundle bundle) {
        this.f50f.mo5009a(bundle);
        C0184a aVar = this.f48d;
        aVar.f1031b = this;
        for (C0185b a : aVar.f1030a) {
            a.mo92a(this);
        }
        super.onCreate(bundle);
        C1678q.m4098c(this);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f53i.mo1401a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0033e eVar;
        C1686w wVar = this.f51g;
        if (wVar == null && (eVar = (C0033e) getLastNonConfigurationInstance()) != null) {
            wVar = eVar.f61a;
        }
        if (wVar == null) {
            return null;
        }
        C0033e eVar2 = new C0033e();
        eVar2.f61a = wVar;
        return eVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C1667h hVar = this.f49e;
        if (hVar instanceof C1667h) {
            C1661d.C1663b bVar = C1661d.C1663b.CREATED;
            hVar.mo4771c("setCurrentState");
            hVar.mo4773f(bVar);
        }
        super.onSaveInstanceState(bundle);
        this.f50f.mo5010b(bundle);
    }

    public void reportFullyDrawn() {
        try {
            if (C1716a.m4172r()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    public void setContentView(int i) {
        mo74n();
        super.setContentView(i);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        mo74n();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        mo74n();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}

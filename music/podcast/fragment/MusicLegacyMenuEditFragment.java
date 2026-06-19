package com.bilibili.music.podcast.fragment;

import Rr0.d;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.comment2.comments.view.z;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.fasthybrid.uimodule.widget.appvideo.control.b;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.widgets.TintSwitchCompat;
import com.bilibili.music.podcast.fragment.MusicLegacyMenuEditFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.C8397q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicLegacyMenuEditFragment.class */
public final class MusicLegacyMenuEditFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f66593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f66594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public EditText f66595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public EditText f66596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f66597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f66598g;

    @Nullable
    public TintSwitchCompat h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f66599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f66600j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f66604n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f66601k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f66602l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f66603m = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f66605o = LazyKt.lazy(new d(this, 7));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicLegacyMenuEditFragment$a.class */
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function1<Editable, Unit> f66606a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super Editable, Unit> function1) {
            this.f66606a = function1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Nullable Editable editable) {
            this.f66606a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Nullable CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    public final void jf(boolean z6) {
        if (z6) {
            TextView textView = this.f66599i;
            if (textView != null) {
                textView.setText(getString(this.f66604n ? 2131831717 : 2131831718));
                return;
            }
            return;
        }
        TextView textView2 = this.f66599i;
        if (textView2 != null) {
            textView2.setText(getString(2131831716));
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.setTitle(2131831719);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f66600j = BundleUtil.getLong(arguments, "key_menu_id", new long[]{0});
                this.f66601k = BundleUtil.getString(arguments, "key_name", new String[]{""});
                this.f66602l = BundleUtil.getString(arguments, "key_desc", new String[]{""});
                this.f66603m = BundleUtil.getBoolean(arguments, "key_is_public", new boolean[]{true});
                this.f66604n = BundleUtil.getBoolean(arguments, "key_is_default", new boolean[]{false});
            }
        } catch (Exception e7) {
            C8397q.a("e:", "MusicLegacyMenuEditFragment", e7);
        }
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.add(getString(2131841640)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) { // from class: qi0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicLegacyMenuEditFragment f126010a;

            {
                this.f126010a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
            @Override // android.view.MenuItem.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean onMenuItemClick(android.view.MenuItem r9) {
                /*
                    Method dump skipped, instruction units count: 261
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: qi0.i.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }).setShowAsAction(2);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499516, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f66593b = view.findViewById(2131304879);
        this.f66594c = view.findViewById(2131304820);
        this.f66595d = (EditText) view.findViewById(2131307754);
        this.f66596e = (EditText) view.findViewById(2131299987);
        this.f66597f = (TextView) view.findViewById(2131314881);
        this.f66598g = (TextView) view.findViewById(2131314426);
        this.h = (TintSwitchCompat) view.findViewById(2131309650);
        this.f66599i = (TextView) view.findViewById(2131315554);
        EditText editText = this.f66595d;
        if (editText != null) {
            editText.addTextChangedListener(new a(new z(this, 3)));
        }
        EditText editText2 = this.f66596e;
        if (editText2 != null) {
            editText2.addTextChangedListener(new a(new b(this, 1)));
        }
        TintSwitchCompat tintSwitchCompat = this.h;
        if (tintSwitchCompat != null) {
            tintSwitchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: qi0.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MusicLegacyMenuEditFragment f126011a;

                {
                    this.f126011a = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                    this.f126011a.jf(z6);
                }
            });
        }
        TextView textView = this.f66597f;
        if (textView != null) {
            textView.setText(getString(2131831711, Integer.valueOf(this.f66601k.length())));
        }
        TextView textView2 = this.f66598g;
        if (textView2 != null) {
            textView2.setText(getString(2131831712, Integer.valueOf(this.f66602l.length())));
        }
        EditText editText3 = this.f66595d;
        if (editText3 != null) {
            editText3.setText(this.f66601k);
        }
        EditText editText4 = this.f66596e;
        if (editText4 != null) {
            editText4.setText(this.f66602l);
        }
        TintSwitchCompat tintSwitchCompat2 = this.h;
        if (tintSwitchCompat2 != null) {
            tintSwitchCompat2.setChecked(this.f66603m);
        }
        TintSwitchCompat tintSwitchCompat3 = this.h;
        jf(tintSwitchCompat3 != null ? tintSwitchCompat3.isChecked() : true);
        if (this.f66604n) {
            View view2 = this.f66594c;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            TextView textView3 = this.f66597f;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            EditText editText5 = this.f66595d;
            if (editText5 != null) {
                editText5.setEnabled(false);
            }
        }
    }
}

package com.bilibili.relation.group;

import Gs0.m;
import Gs0.n;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.StringUtil;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.relation.api.RelationService;
import com.bilibili.relation.group.CreateGroupFragment;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import org.jetbrains.annotations.NotNull;
import v1.C8774a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/group/CreateGroupFragment.class */
public class CreateGroupFragment extends BaseToolbarFragment implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f86085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TintProgressDialog f86086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelationService f86087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f86089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f86090g;
    public int h;

    public final void mf() {
        String string = this.f86085b.getText().toString();
        if (TextUtils.isEmpty(string)) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f86085b, "translationX", 0.0f, 25.0f, -25.0f, 25.0f, -25.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new C8774a());
            objectAnimatorOfFloat.start();
            return;
        }
        InputMethodManagerHelper.tryHideSoftInput(p3());
        this.f86086c = TintProgressDialog.show(getContext(), null, getString(2131841551), true, false);
        if (this.f86088e) {
            this.f86087d.createGroup(BiliAccounts.get(getContext()).getAccessKey(), string).enqueue(new n(this, string));
        } else {
            this.f86087d.renameGroup(BiliAccounts.get(getContext()).getAccessKey(), this.f86089f, string).enqueue(new m(this, string));
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        p3().getWindow().setSoftInputMode(5);
        this.f86087d = (RelationService) ServiceGenerator.createService(RelationService.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f86089f = arguments.getString("group_id");
            this.f86090g = arguments.getString("group_name");
            this.h = BundleUtil.getInteger(arguments, "group_pos_in_list", new Integer[0]).intValue();
        }
        if (StringUtil.isBlank(this.f86089f)) {
            this.f86088e = true;
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment
    public final void onCreateToolbarMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        MenuItem menuItemAdd = menu.add(2131841512);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) { // from class: Gs0.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreateGroupFragment f7410a;

            {
                this.f7410a = this;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f7410a.mf();
                return true;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494038, viewGroup, false);
        EditText editText = (EditText) viewInflate.findViewById(2131304923);
        this.f86085b = editText;
        if (!this.f86088e) {
            editText.setText(this.f86090g);
            this.f86085b.setSelection(this.f86090g.length());
        }
        this.f86085b.setOnEditorActionListener(this);
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TintProgressDialog tintProgressDialog = this.f86086c;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return true;
        }
        mf();
        return true;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @org.jetbrains.annotations.Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (StringUtil.isBlank(this.f86089f) && p3() != null) {
            setTitle(p3().getString(2131847630));
        } else if (p3() != null) {
            setTitle(p3().getString(2131847610));
        }
    }
}

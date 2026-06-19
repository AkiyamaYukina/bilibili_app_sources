package com.bilibili.tgwt.im.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.ImageViewCompat;
import com.bilibili.app.comm.emoticon.model.Emote;
import com.bilibili.app.comm.emoticon.ui.ImageEmoticonPanel;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.im.widget.RealInputBar;
import com.bilibili.tgwt.service.ChatService;
import j5.C7642d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/m.class */
@StabilityInferred(parameters = 0)
public final class m extends AlertDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final v f111433A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f111434B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public a f111435C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatService f111438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC6660f f111439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Handler f111440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f111441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RealInputBar f111442g;
    public FrameLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BangumiFakeInputBar f111443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f111444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f111445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.comm.emoticon.ui.m f111446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final List<RealInputBar.e> f111447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f111448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f111449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.bilibili.chatroom.widget.j f111450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f111451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Ob1.z f111452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final j f111453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final s f111454t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final r f111455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final o f111456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final u f111457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final q f111458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final n f111459y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final p f111460z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/m$a.class */
    public interface a {
        void a(@NotNull Emote emote);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/m$b.class */
    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f111461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f111462b;

        public b(View view, m mVar) {
            this.f111461a = view;
            this.f111462b = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            InputMethodManagerHelper.hideSoftInput(this.f111461a.getContext(), this.f111461a, 0);
            this.f111462b.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.tgwt.im.widget.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.bilibili.tgwt.im.widget.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.bilibili.tgwt.im.widget.j] */
    public m(@NotNull final Context context, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull ChatService chatService, @NotNull InterfaceC6660f interfaceC6660f) {
        super(context);
        this.f111436a = true;
        this.f111437b = chatRoomManagerService;
        this.f111438c = chatService;
        this.f111439d = interfaceC6660f;
        this.f111440e = new Handler(Looper.getMainLooper());
        this.f111447m = new ArrayList();
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.tgwt.im.widget.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f111426a;

            {
                this.f111426a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                m mVar = this.f111426a;
                mVar.f111448n = false;
                BangumiFakeInputBar bangumiFakeInputBar = mVar.f111443i;
                BangumiFakeInputBar bangumiFakeInputBar2 = bangumiFakeInputBar;
                if (bangumiFakeInputBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
                    bangumiFakeInputBar2 = null;
                }
                bangumiFakeInputBar2.setVisibility(0);
                BangumiFakeInputBar bangumiFakeInputBar3 = mVar.f111443i;
                BangumiFakeInputBar bangumiFakeInputBar4 = bangumiFakeInputBar3;
                if (bangumiFakeInputBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
                    bangumiFakeInputBar4 = null;
                }
                RealInputBar realInputBar = mVar.f111442g;
                RealInputBar realInputBar2 = realInputBar;
                if (realInputBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                    realInputBar2 = null;
                }
                bangumiFakeInputBar4.setText(String.valueOf(realInputBar2.getText()));
                FrameLayout frameLayout = mVar.h;
                FrameLayout frameLayout2 = frameLayout;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmoticonContainer");
                    frameLayout2 = null;
                }
                frameLayout2.setVisibility(8);
                RealInputBar realInputBar3 = mVar.f111442g;
                RealInputBar realInputBar4 = realInputBar3;
                if (realInputBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                    realInputBar4 = null;
                }
                realInputBar4.clearFocus();
                com.bilibili.chatroom.widget.j jVar = mVar.f111450p;
                com.bilibili.chatroom.widget.j jVar2 = jVar;
                if (jVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSoftKeyBoardListener");
                    jVar2 = null;
                }
                View view = jVar2.k;
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(jVar2.m);
                    jVar2.k = null;
                }
                mVar.f111437b.f110930w.setValue(0);
                mVar.f111440e.removeCallbacks(mVar.f111453s);
                mVar.f111440e.removeCallbacks(mVar.f111452r);
                if (mVar.f111434B) {
                    ChatService chatService2 = mVar.f111438c;
                    RealInputBar realInputBar5 = mVar.f111442g;
                    if (realInputBar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                        realInputBar5 = null;
                    }
                    chatService2.r(String.valueOf(realInputBar5.getText()), mVar.f111439d);
                    mVar.f111434B = false;
                }
            }
        });
        this.f111452r = new Ob1.z(this, 1);
        this.f111453s = new Runnable(this, context) { // from class: com.bilibili.tgwt.im.widget.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f111427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f111428b;

            {
                this.f111427a = this;
                this.f111428b = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f111427a.k(Uj0.c.b(284.0f, this.f111428b));
            }
        };
        this.f111454t = new s(this, context);
        this.f111455u = new Object();
        this.f111456v = new o(this, context);
        this.f111457w = new Object();
        this.f111458x = new q(this);
        this.f111459y = new n(this);
        this.f111460z = new p(this);
        this.f111433A = new v(this);
    }

    public static final void j(m mVar, Emote emote) {
        mVar.getClass();
        String str = emote.name;
        t tVar = new t(mVar);
        ((lV.z) tVar).a = str;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(tVar, 0, str.length(), 33);
        RealInputBar realInputBar = mVar.f111442g;
        RealInputBar realInputBar2 = realInputBar;
        if (realInputBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar2 = null;
        }
        int selectionStart = realInputBar2.getSelectionStart();
        if (selectionStart >= 0) {
            RealInputBar realInputBar3 = mVar.f111442g;
            RealInputBar realInputBar4 = realInputBar3;
            if (realInputBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                realInputBar4 = null;
            }
            Editable text = realInputBar4.getText();
            if (text != null) {
                text.insert(selectionStart, spannableString);
            }
        } else {
            RealInputBar realInputBar5 = mVar.f111442g;
            RealInputBar realInputBar6 = realInputBar5;
            if (realInputBar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                realInputBar6 = null;
            }
            realInputBar6.c(spannableString);
        }
        a aVar = mVar.f111435C;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmojiClickListener");
            aVar = null;
        }
        aVar.a(emote);
    }

    public final void k(int i7) {
        RealInputBar realInputBar = this.f111442g;
        RealInputBar realInputBar2 = realInputBar;
        if (realInputBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar2 = null;
        }
        ImageView imageView = realInputBar2.f111384d;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTv");
            imageView2 = null;
        }
        imageView2.setImageDrawable(AppCompatResources.getDrawable(realInputBar2.getContext(), 2131233647));
        ImageView imageView3 = realInputBar2.f111384d;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTv");
            imageView4 = null;
        }
        ImageViewCompat.setImageTintList(imageView4, AppCompatResources.getColorStateList(realInputBar2.getContext(), R$color.Ga5));
        RealInputBar realInputBar3 = this.f111442g;
        RealInputBar realInputBar4 = realInputBar3;
        if (realInputBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar4 = null;
        }
        realInputBar4.clearFocus();
        this.f111437b.f110930w.setValue(Integer.valueOf(i7));
        if (this.f111446l != null) {
            FrameLayout frameLayout = this.h;
            FrameLayout frameLayout2 = frameLayout;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonContainer");
                frameLayout2 = null;
            }
            frameLayout2.setVisibility(0);
            FrameLayout frameLayout3 = this.h;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonContainer");
                frameLayout3 = null;
            }
            frameLayout3.getLayoutParams().height = i7;
            Iterator it = ((ArrayList) this.f111447m).iterator();
            while (it.hasNext()) {
                ((RealInputBar.e) it.next()).a(true);
            }
        }
    }

    public final boolean l(boolean z6) {
        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            gm.a.b(getContext(), SearchBangumiItem.TYPE_FULLNET_VARIETY, "activity://main/login/", (String) null);
            return false;
        }
        if (this.f111448n) {
            this.f111448n = false;
            RealInputBar realInputBar = this.f111442g;
            RealInputBar realInputBar2 = realInputBar;
            if (realInputBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                realInputBar2 = null;
            }
            InputMethodManager inputMethodManager = realInputBar2.f111383c;
            InputMethodManager inputMethodManager2 = inputMethodManager;
            if (inputMethodManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mImm");
                inputMethodManager2 = null;
            }
            EditText editText = realInputBar2.f111381a;
            EditText editText2 = editText;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                editText2 = null;
            }
            inputMethodManager2.hideSoftInputFromWindow(editText2.getWindowToken(), 0, null);
        }
        if (!z6) {
            return true;
        }
        this.f111440e.postDelayed(this.f111453s, 150L);
        return true;
    }

    public final void m() {
        RealInputBar realInputBar = this.f111442g;
        RealInputBar realInputBar2 = realInputBar;
        if (realInputBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar2 = null;
        }
        EditText editText = realInputBar2.f111381a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText2 = null;
        }
        if (!editText2.isFocused()) {
            RealInputBar realInputBar3 = this.f111442g;
            RealInputBar realInputBar4 = realInputBar3;
            if (realInputBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                realInputBar4 = null;
            }
            EditText editText3 = realInputBar4.f111381a;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                editText3 = null;
            }
            editText3.requestFocus();
            return;
        }
        if (this.f111448n) {
            return;
        }
        this.f111448n = true;
        if (this.f111446l != null) {
            FrameLayout frameLayout = this.h;
            FrameLayout frameLayout2 = frameLayout;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonContainer");
                frameLayout2 = null;
            }
            if (frameLayout2.isShown()) {
                FrameLayout frameLayout3 = this.h;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmoticonContainer");
                    frameLayout3 = null;
                }
                frameLayout3.setVisibility(8);
                Iterator it = ((ArrayList) this.f111447m).iterator();
                while (it.hasNext()) {
                    ((RealInputBar.e) it.next()).a(false);
                }
            }
        }
        this.f111440e.postDelayed(this.f111452r, 150L);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        View view2 = this.f111441f;
        View view3 = view2;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view3 = null;
        }
        view3.animate().alpha(0.0f).setDuration(150L).setInterpolator(new AccelerateInterpolator()).setListener(new b(view, this)).start();
    }

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        ImageEmoticonPanel mVar;
        super.onCreate(bundle);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131500175, (ViewGroup) null, false);
        this.f111441f = viewInflate;
        View view = viewInflate;
        if (viewInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view = null;
        }
        this.h = (FrameLayout) view.findViewById(2131300993);
        View view2 = this.f111441f;
        View view3 = view2;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view3 = null;
        }
        RealInputBar realInputBar = (RealInputBar) view3.findViewById(2131309925);
        this.f111442g = realInputBar;
        RealInputBar realInputBar2 = realInputBar;
        if (realInputBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar2 = null;
        }
        realInputBar2.setEmoticonBadgeVisible(this.f111444j);
        RealInputBar realInputBar3 = this.f111442g;
        RealInputBar realInputBar4 = realInputBar3;
        if (realInputBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar4 = null;
        }
        realInputBar4.setOnInputFocusChangeListener(this.f111458x);
        RealInputBar realInputBar5 = this.f111442g;
        RealInputBar realInputBar6 = realInputBar5;
        if (realInputBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar6 = null;
        }
        realInputBar6.setOnEmoticonClickListener(this.f111459y);
        RealInputBar realInputBar7 = this.f111442g;
        RealInputBar realInputBar8 = realInputBar7;
        if (realInputBar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar8 = null;
        }
        realInputBar8.setOnInputBarClickListener(this.f111460z);
        RealInputBar realInputBar9 = this.f111442g;
        RealInputBar realInputBar10 = realInputBar9;
        if (realInputBar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar10 = null;
        }
        realInputBar10.setOnVoiceBtnClickListener(this.f111433A);
        RealInputBar realInputBar11 = this.f111442g;
        RealInputBar realInputBar12 = realInputBar11;
        if (realInputBar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar12 = null;
        }
        BangumiFakeInputBar bangumiFakeInputBar = this.f111443i;
        BangumiFakeInputBar bangumiFakeInputBar2 = bangumiFakeInputBar;
        if (bangumiFakeInputBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            bangumiFakeInputBar2 = null;
        }
        realInputBar12.setVoiceBtnVisible(bangumiFakeInputBar2.f111338b.f111402g);
        boolean z6 = this.f111436a;
        com.bilibili.app.comm.emoticon.ui.m mVar2 = this.f111446l;
        if (mVar2 != null) {
            mVar2.d();
        }
        RealInputBar realInputBar13 = this.f111442g;
        RealInputBar realInputBar14 = realInputBar13;
        if (realInputBar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
            realInputBar14 = null;
        }
        EditText editText = realInputBar14.f111381a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText2 = null;
        }
        if (!editText2.isInEditMode()) {
            Context context = getContext();
            o oVar = this.f111456v;
            u uVar = this.f111457w;
            FrameLayout frameLayout = this.h;
            FrameLayout frameLayout2 = frameLayout;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonContainer");
                frameLayout2 = null;
            }
            if (context == null || TextUtils.isEmpty("reply")) {
                mVar = null;
            } else {
                if (z6) {
                    mVar = new com.bilibili.app.comm.emoticon.ui.m("reply");
                    mVar.u = new ArrayList();
                } else {
                    mVar = new com.bilibili.app.comm.emoticon.ui.m("reply");
                }
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).h = false;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).i = false;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).j = null;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).e = context;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).c = oVar;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).d = uVar;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).f = null;
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).b = frameLayout2;
                frameLayout2.addView(mVar.c(mVar.b()));
                mVar.e(mVar.a());
                ((com.bilibili.app.comm.emoticon.ui.m) mVar).g = "watch-together";
            }
            this.f111446l = mVar;
        }
        View view4 = this.f111441f;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view5 = null;
        }
        setContentView(view5);
        View view6 = this.f111441f;
        View view7 = view6;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view7 = null;
        }
        view7.setOnClickListener(this);
        BangumiFakeInputBar bangumiFakeInputBar3 = this.f111443i;
        BangumiFakeInputBar bangumiFakeInputBar4 = bangumiFakeInputBar3;
        if (bangumiFakeInputBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            bangumiFakeInputBar4 = null;
        }
        String string = bangumiFakeInputBar4.getText().toString();
        if (string.length() > 0) {
            RealInputBar realInputBar15 = this.f111442g;
            RealInputBar realInputBar16 = realInputBar15;
            if (realInputBar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                realInputBar16 = null;
            }
            realInputBar16.setText(string);
            RealInputBar realInputBar17 = this.f111442g;
            RealInputBar realInputBar18 = realInputBar17;
            if (realInputBar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                realInputBar18 = null;
            }
            realInputBar18.setSelection(string.length());
        }
        r rVar = this.f111455u;
        if (!((ArrayList) this.f111447m).contains(rVar)) {
            ((ArrayList) this.f111447m).add(rVar);
        }
        View view8 = this.f111441f;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view8 = null;
        }
        view8.post(new k(this, 0));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(131080);
        window.setSoftInputMode(16);
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setDimAmount(0.0f);
        C7642d.a(window, 0);
        attributes.height = -1;
        attributes.width = -1;
        window.setAttributes(attributes);
        View view = this.f111441f;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view2 = null;
        }
        final int i7 = 0;
        view2.postDelayed(new Runnable(this, i7) { // from class: com.bilibili.tgwt.im.widget.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f111431a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f111432b;

            {
                this.f111431a = i7;
                this.f111432b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f111431a) {
                    case 0:
                        m mVar = (m) this.f111432b;
                        mVar.f111449o = false;
                        if (!mVar.f111445k) {
                            mVar.m();
                        } else {
                            mVar.l(true);
                        }
                        break;
                    default:
                        ((ValueAnimator) this.f111432b).start();
                        break;
                }
            }
        }, 150L);
        com.bilibili.chatroom.widget.j jVar = new com.bilibili.chatroom.widget.j(this.f111454t, getContext());
        this.f111450p = jVar;
        jVar.a(ContextUtilKt.requireActivity(getContext()).getWindow());
        View view3 = this.f111441f;
        View view4 = view3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view4 = null;
        }
        view4.setAlpha(0.0f);
        View view5 = this.f111441f;
        View view6 = view5;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            view6 = null;
        }
        view6.animate().alpha(1.0f).setDuration(150L).setInterpolator(new AccelerateInterpolator()).setListener(null).start();
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        BangumiFakeInputBar bangumiFakeInputBar = this.f111443i;
        BangumiFakeInputBar bangumiFakeInputBar2 = bangumiFakeInputBar;
        if (bangumiFakeInputBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFakeInputBar");
            bangumiFakeInputBar2 = null;
        }
        bangumiFakeInputBar2.setVisibility(8);
    }
}

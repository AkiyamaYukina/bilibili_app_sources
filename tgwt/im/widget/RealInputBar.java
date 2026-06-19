package com.bilibili.tgwt.im.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.chatroom.widget.ChatInputEditText;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar.class */
@StabilityInferred(parameters = 0)
public class RealInputBar extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatInputEditText f111381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f111382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputMethodManager f111383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f111384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f111385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f111386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f111387g;

    @Nullable
    public d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public c f111388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public a f111389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public b f111390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public f f111391l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$a.class */
    public interface a {
        void a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$b.class */
    public interface b {
        void a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$c.class */
    public interface c {
        void a(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$d.class */
    public interface d {
        void a(@NotNull String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$e.class */
    public interface e {
        void a(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$f.class */
    public interface f {
        void b();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$g.class */
    public static final class g implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RealInputBar f111392a;

        public g(RealInputBar realInputBar) {
            this.f111392a = realInputBar;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            if (i7 != 2 && i7 != 4 && i7 != 6) {
                return false;
            }
            RealInputBar realInputBar = this.f111392a;
            d dVar = realInputBar.h;
            if (dVar == null) {
                return true;
            }
            TextView textView2 = realInputBar.f111381a;
            TextView textView3 = textView2;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                textView3 = null;
            }
            dVar.a(String.valueOf(textView3.getText()));
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$h.class */
    public static final class h implements ChatInputEditText.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RealInputBar f111393a;

        public h(RealInputBar realInputBar) {
            this.f111393a = realInputBar;
        }

        public final void a(int i7, int i8) {
            RealInputBar realInputBar = this.f111393a;
            int iA = RealInputBar.a(realInputBar, i7);
            int iA2 = RealInputBar.a(realInputBar, i8);
            EditText editText = realInputBar.f111381a;
            EditText editText2 = editText;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                editText2 = null;
            }
            int length = editText2.length();
            if (iA < 0 || i7 > length || iA2 < 0 || iA2 > length) {
                return;
            }
            EditText editText3 = realInputBar.f111381a;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                editText3 = null;
            }
            editText3.setSelection(iA, iA2);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/RealInputBar$i.class */
    public static final class i implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f111394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RealInputBar f111395b;

        public i(RealInputBar realInputBar) {
            this.f111395b = realInputBar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextView textView = this.f111395b.f111386f;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvSend");
                textView2 = null;
            }
            textView2.setEnabled(editable.length() > 0);
            if (this.f111394a) {
                RealInputBar.b(this.f111395b, editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            this.f111394a = i8 != 0;
        }
    }

    public RealInputBar(@NotNull Context context) {
        this(context, null);
    }

    public RealInputBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener(this) { // from class: com.bilibili.tgwt.im.widget.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RealInputBar f111380a;

            {
                this.f111380a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                RealInputBar realInputBar = this.f111380a;
                if (realInputBar.f111388i != null) {
                    Editable text = realInputBar.getText();
                    realInputBar.setSelection(text != null ? text.length() : 0);
                    realInputBar.f111388i.a(z6);
                }
            }
        };
        i iVar = new i(this);
        h hVar = new h(this);
        g gVar = new g(this);
        setFocusableInTouchMode(true);
        this.f111383c = (InputMethodManager) context.getSystemService("input_method");
        LayoutInflater.from(context).inflate(2131500534, (ViewGroup) this, true);
        this.f111381a = findViewById(2131309919);
        this.f111382b = findViewById(2131309928);
        this.f111384d = (ImageView) findViewById(2131309923);
        this.f111385e = (ImageView) findViewById(2131309920);
        this.f111386f = (TextView) findViewById(2131309931);
        this.f111387g = findViewById(2131304617);
        TextView textView = this.f111386f;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSend");
            textView2 = null;
        }
        textView2.setEnabled(false);
        ImageView imageView = this.f111384d;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTv");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this);
        EditText editText = this.f111381a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText2 = null;
        }
        editText2.setOnClickListener(this);
        TextView textView3 = this.f111386f;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSend");
            textView4 = null;
        }
        textView4.setOnClickListener(this);
        View view = this.f111387g;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voiceBtn");
            view2 = null;
        }
        view2.setOnClickListener(this);
        EditText editText3 = this.f111381a;
        EditText editText4 = editText3;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText4 = null;
        }
        editText4.setOnFocusChangeListener(onFocusChangeListener);
        EditText editText5 = this.f111381a;
        EditText editText6 = editText5;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText6 = null;
        }
        editText6.setOnEditorActionListener(gVar);
        ChatInputEditText chatInputEditText = this.f111381a;
        ChatInputEditText chatInputEditText2 = chatInputEditText;
        if (chatInputEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            chatInputEditText2 = null;
        }
        chatInputEditText2.setOnSelectionChange(hVar);
        EditText editText7 = this.f111381a;
        EditText editText8 = editText7;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText8 = null;
        }
        editText8.addTextChangedListener(iVar);
        EditText editText9 = this.f111381a;
        if (editText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText9 = null;
        }
        editText9.setTextColor(ContextCompat.getColor(context, R$color.Ga10));
    }

    public static final int a(RealInputBar realInputBar, int i7) {
        int spanEnd;
        lV.z[] allSpan = realInputBar.getAllSpan();
        if (allSpan != null) {
            int length = allSpan.length;
            int i8 = 0;
            while (true) {
                spanEnd = i7;
                if (i8 >= length) {
                    break;
                }
                lV.z zVar = allSpan[i8];
                EditText editText = realInputBar.f111381a;
                EditText editText2 = editText;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                    editText2 = null;
                }
                int spanStart = editText2.getEditableText().getSpanStart(zVar);
                EditText editText3 = realInputBar.f111381a;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                    editText3 = null;
                }
                spanEnd = editText3.getEditableText().getSpanEnd(zVar);
                if (spanStart + 1 > i7 || i7 >= spanEnd) {
                    i8++;
                } else if (i7 - spanStart <= (spanEnd - spanStart) / 2) {
                    spanEnd = spanStart;
                }
            }
        } else {
            spanEnd = -1;
        }
        return spanEnd;
    }

    public static final void b(RealInputBar realInputBar, Editable editable) {
        lV.z[] allSpan = realInputBar.getAllSpan();
        if (allSpan == null) {
            return;
        }
        for (lV.z zVar : allSpan) {
            int spanStart = editable.getSpanStart(zVar);
            int spanEnd = editable.getSpanEnd(zVar);
            if (spanStart == spanEnd || !Intrinsics.areEqual(editable.subSequence(spanStart, spanEnd).toString(), zVar.a)) {
                editable.removeSpan(zVar);
                if (spanStart >= 0 && spanEnd >= 0 && spanEnd >= spanStart) {
                    editable.delete(spanStart, spanEnd);
                }
            }
        }
    }

    private final lV.z[] getAllSpan() {
        TextView textView = this.f111381a;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            textView2 = null;
        }
        Editable text = textView2.getText();
        if (text == null) {
            return null;
        }
        return (lV.z[]) text.getSpans(0, text.length(), lV.z.class);
    }

    public final void c(@Nullable CharSequence charSequence) {
        TextView textView = this.f111381a;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            textView2 = null;
        }
        Editable text = textView2.getText();
        if (text != null) {
            text.append(charSequence);
            return;
        }
        EditText editText = this.f111381a;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText = null;
        }
        editText.setText(charSequence);
    }

    public final int getSelectionStart() {
        EditText editText = this.f111381a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText2 = null;
        }
        return editText2.getSelectionStart();
    }

    @Nullable
    public final Editable getText() {
        TextView textView = this.f111381a;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            textView2 = null;
        }
        return textView2.getText();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        f fVar;
        ChatInputEditText chatInputEditText = this.f111381a;
        ChatInputEditText chatInputEditText2 = chatInputEditText;
        if (chatInputEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            chatInputEditText2 = null;
        }
        if (Intrinsics.areEqual(view, chatInputEditText2)) {
            if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                gm.a.b(getContext(), SearchBangumiItem.TYPE_FULLNET_VARIETY, "activity://main/login/", (String) null);
                return;
            }
            b bVar = this.f111390k;
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        ImageView imageView = this.f111384d;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTv");
            imageView2 = null;
        }
        if (Intrinsics.areEqual(view, imageView2)) {
            a aVar = this.f111389j;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        TextView textView = this.f111386f;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSend");
            textView2 = null;
        }
        if (Intrinsics.areEqual(view, textView2)) {
            d dVar = this.h;
            if (dVar != null) {
                TextView textView3 = this.f111381a;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                    textView3 = null;
                }
                dVar.a(String.valueOf(textView3.getText()));
                return;
            }
            return;
        }
        View view2 = this.f111387g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voiceBtn");
            view2 = null;
        }
        if (!Intrinsics.areEqual(view, view2) || (fVar = this.f111391l) == null) {
            return;
        }
        fVar.b();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NotNull View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (i7 == 0) {
            EditText editText = this.f111381a;
            EditText editText2 = editText;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                editText2 = null;
            }
            editText2.clearFocus();
        }
    }

    public final void setEmoticonBadgeVisible(boolean z6) {
        ImageView imageView = this.f111385e;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonBadge");
            imageView2 = null;
        }
        imageView2.setVisibility(z6 ? 0 : 8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        EditText editText = this.f111381a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText2 = null;
        }
        editText2.setEnabled(z6);
        EditText editText3 = this.f111381a;
        EditText editText4 = editText3;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText4 = null;
        }
        editText4.setClickable(z6);
        TextView textView = this.f111386f;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSend");
            textView2 = null;
        }
        textView2.setEnabled(z6);
        TextView textView3 = this.f111386f;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvSend");
            textView4 = null;
        }
        textView4.setClickable(z6);
        ImageView imageView = this.f111384d;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTv");
            imageView2 = null;
        }
        imageView2.setEnabled(z6);
        ImageView imageView3 = this.f111384d;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTv");
            imageView3 = null;
        }
        imageView3.setClickable(z6);
        super.setEnabled(z6);
    }

    public final void setOnEmoticonClickListener(@Nullable a aVar) {
        this.f111389j = aVar;
    }

    public final void setOnInputBarClickListener(@Nullable b bVar) {
        this.f111390k = bVar;
    }

    public final void setOnInputFocusChangeListener(@Nullable c cVar) {
        this.f111388i = cVar;
    }

    public final void setOnSentListener(@Nullable d dVar) {
        this.h = dVar;
    }

    public final void setOnVoiceBtnClickListener(@NotNull f fVar) {
        this.f111391l = fVar;
    }

    public final void setSelection(int i7) {
        if (i7 >= 0) {
            EditText editText = this.f111381a;
            EditText editText2 = editText;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                editText2 = null;
            }
            if (i7 > editText2.length()) {
                return;
            }
            EditText editText3 = this.f111381a;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
                editText3 = null;
            }
            editText3.setSelection(i7);
        }
    }

    public final void setText(@Nullable CharSequence charSequence) {
        EditText editText = this.f111381a;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputEt");
            editText2 = null;
        }
        editText2.setText(charSequence);
    }

    public final void setVoiceBtnVisible(boolean z6) {
        View view = this.f111387g;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voiceBtn");
            view2 = null;
        }
        view2.setVisibility(z6 ? 0 : 8);
    }
}

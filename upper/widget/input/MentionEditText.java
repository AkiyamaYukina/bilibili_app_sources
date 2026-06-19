package com.bilibili.upper.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.collection.C3269h;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.RunnableC6553g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText.class */
public class MentionEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f114517j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, a> f114518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RunnableC6553g f114519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f114521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<g> f114522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f114523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f114524g;
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f114525i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText$ColoredTextBean.class */
    public static class ColoredTextBean implements Serializable {
        public int end;
        public boolean isFinished;
        public int start;
        public String text;

        public ColoredTextBean(String str, int i7, int i8) {
            this.text = str;
            this.start = i7;
            this.end = i8;
            this.isFinished = this.isFinished;
        }

        public ColoredTextBean(String str, int i7, int i8, boolean z6) {
            this.text = str;
            this.start = i7;
            this.end = i8;
            this.isFinished = z6;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ColoredTextBean{text='");
            sb.append(this.text);
            sb.append("', start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", isFinished=");
            return O4.a.b(sb, this.isFinished, '}');
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Pattern f114526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f114527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f114528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f114529d = 0;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText$b.class */
    public final class b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MentionEditText f114530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MentionEditText f114531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MentionEditText mentionEditText, InputConnection inputConnection, MentionEditText mentionEditText2) {
            super(inputConnection, true);
            this.f114531b = mentionEditText;
            this.f114530a = mentionEditText2;
        }

        public final boolean b(int i7, int i8) {
            a aVar = (a) ((HashMap) this.f114531b.f114518a).get("lottery");
            if (aVar == null) {
                return false;
            }
            String string = this.f114530a.getText().toString();
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            int iIndexOf = string.indexOf(this.f114531b.getContext().getString(2131837095));
            int length = this.f114531b.getContext().getString(2131837095).length();
            if (i7 == i8) {
                if (i7 != length + iIndexOf || aVar.f114528c) {
                    return false;
                }
                this.f114531b.setSelection(iIndexOf);
                ToastHelper.showToastShort(this.f114531b.getContext(), 2131851456);
                return true;
            }
            if (i7 >= i8 || i8 > string.length()) {
                return false;
            }
            if (!aVar.f114526a.matcher(string.substring(i7, i8)).find() || aVar.f114528c) {
                return false;
            }
            this.f114531b.setSelection(iIndexOf);
            ToastHelper.showToastShort(this.f114531b.getContext(), 2131851456);
            return true;
        }

        public final boolean c(int i7, int i8) {
            a aVar = (a) ((HashMap) this.f114531b.f114518a).get("vote");
            if (aVar == null) {
                return false;
            }
            String string = this.f114530a.getText().toString();
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            int iIndexOf = string.indexOf(this.f114531b.h);
            int length = this.f114531b.h.length();
            if (i7 == i8) {
                if (i7 != length + iIndexOf || aVar.f114528c) {
                    return false;
                }
                if (iIndexOf != -1) {
                    this.f114531b.setSelection(iIndexOf);
                }
                ToastHelper.showToastShort(this.f114531b.getContext(), 2131851038);
                return true;
            }
            if (i7 >= i8 || i8 > string.length()) {
                return false;
            }
            if (!aVar.f114526a.matcher(string.substring(i7, i8)).find() || aVar.f114528c) {
                return false;
            }
            this.f114531b.setSelection(iIndexOf);
            ToastHelper.showToastShort(this.f114531b.getContext(), 2131851038);
            return true;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean commitText(CharSequence charSequence, int i7) {
            Map<String, a> map;
            if (TextUtils.isEmpty(charSequence) && (map = this.f114531b.f114518a) != null) {
                a aVar = (a) ((HashMap) map).get("lottery");
                if (aVar != null && !aVar.f114528c) {
                    String string = this.f114530a.getText().toString();
                    if (!TextUtils.isEmpty(string)) {
                        int selectionStart = this.f114530a.getSelectionStart();
                        int selectionEnd = this.f114530a.getSelectionEnd();
                        int iIndexOf = string.indexOf(this.f114531b.getContext().getString(2131837095));
                        if (iIndexOf >= selectionStart && iIndexOf < selectionEnd) {
                            ToastHelper.showToastShort(this.f114531b.getContext(), 2131851456);
                            return false;
                        }
                    }
                }
                a aVar2 = (a) ((HashMap) this.f114531b.f114518a).get("vote");
                if (aVar2 != null && !aVar2.f114528c) {
                    String string2 = this.f114530a.getText().toString();
                    if (!TextUtils.isEmpty(string2)) {
                        int selectionStart2 = this.f114530a.getSelectionStart();
                        int selectionEnd2 = this.f114530a.getSelectionEnd();
                        int iIndexOf2 = string2.indexOf(this.f114531b.h);
                        if (iIndexOf2 >= selectionStart2 && iIndexOf2 < selectionEnd2) {
                            ToastHelper.showToastShort(this.f114531b.getContext(), 2131851038);
                            return false;
                        }
                    }
                }
            }
            return super.commitText(charSequence, i7);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean deleteSurroundingText(int i7, int i8) {
            boolean z6 = true;
            if (i7 != 1 || i8 != 0) {
                return super.deleteSurroundingText(i7, i8);
            }
            if (!sendKeyEvent(new KeyEvent(0, 67)) || !sendKeyEvent(new KeyEvent(1, 67))) {
                z6 = false;
            }
            return z6;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            g gVar;
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
                    int selectionStart = this.f114530a.getSelectionStart();
                    int selectionEnd = this.f114530a.getSelectionEnd();
                    if (b(selectionStart, selectionEnd) || c(selectionStart, selectionEnd)) {
                        return false;
                    }
                }
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart2 = this.f114530a.getSelectionStart();
            int selectionEnd2 = this.f114530a.getSelectionEnd();
            if (b(selectionStart2, selectionEnd2) || c(selectionStart2, selectionEnd2)) {
                return false;
            }
            List<g> list = this.f114531b.f114522e;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                do {
                    gVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    gVar = (g) it.next();
                } while (!gVar.a(selectionStart2, selectionEnd2));
            } else {
                gVar = null;
            }
            if (gVar == null) {
                this.f114531b.f114520c = false;
                return super.sendKeyEvent(keyEvent);
            }
            boolean zB = gVar.b();
            int i7 = gVar.f114534b;
            int i8 = gVar.f114533a;
            if (!zB) {
                MentionEditText mentionEditText = this.f114531b;
                if (mentionEditText.f114520c || selectionStart2 == i8) {
                    mentionEditText.f114520c = false;
                    return super.sendKeyEvent(keyEvent);
                }
                mentionEditText.f114520c = true;
                mentionEditText.f114521d = gVar;
                try {
                    setSelection(i7, i8);
                    return true;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return true;
                }
            }
            MentionEditText mentionEditText2 = this.f114531b;
            boolean z6 = mentionEditText2.f114520c;
            if (z6 || selectionStart2 == i8) {
                if (z6) {
                    mentionEditText2.g(gVar);
                }
                this.f114531b.f114520c = false;
                return super.sendKeyEvent(keyEvent);
            }
            if (!gVar.f114535c) {
                mentionEditText2.f114520c = false;
                return super.sendKeyEvent(keyEvent);
            }
            mentionEditText2.f114520c = true;
            mentionEditText2.f114521d = gVar;
            try {
                setSelection(i8, i7);
                return true;
            } catch (Exception e8) {
                e8.printStackTrace();
                return true;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText$c.class */
    public final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MentionEditText f114532a;

        public c(MentionEditText mentionEditText) {
            this.f114532a = mentionEditText;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            MentionEditText mentionEditText = this.f114532a;
            int i7 = MentionEditText.f114517j;
            mentionEditText.getClass();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            com.bilibili.upper.module.contribute.up.atuser.b bVar;
            if (i9 != 1 || TextUtils.isEmpty(charSequence)) {
                return;
            }
            char cCharAt = charSequence.toString().charAt(i7);
            for (Map.Entry entry : ((HashMap) this.f114532a.f114518a).entrySet()) {
                if (((String) entry.getKey()).equals(String.valueOf(cCharAt)) && (bVar = this.f114532a.f114524g) != null) {
                    bVar.a(i7, (String) entry.getKey());
                    return;
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText$d.class */
    public interface d {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText$e.class */
    public interface e {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText$f.class */
    public interface f {
        int a(String str);

        boolean b(String str);

        void c(String str, boolean z6, List list, List list2);

        boolean d(String str, String str2);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/MentionEditText$g.class */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f114533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f114534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f114535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f114536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f114537e;

        public g(int i7, int i8) {
            this.f114535c = false;
            this.f114537e = 1;
            this.f114533a = i7;
            this.f114534b = i8;
        }

        public g(String str, int i7, int i8, int i9, boolean z6) {
            this.f114533a = i7;
            this.f114534b = i8;
            this.f114535c = z6;
            this.f114536d = str;
            this.f114537e = i9;
        }

        public final boolean a(int i7, int i8) {
            return this.f114533a <= i7 && this.f114534b >= i8;
        }

        public final boolean b() {
            return "#".equals(this.f114536d) && this.f114537e == 2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range{from=");
            sb.append(this.f114533a);
            sb.append(", to=");
            sb.append(this.f114534b);
            sb.append(", isFinished=");
            sb.append(this.f114535c);
            sb.append(", type='");
            sb.append(this.f114536d);
            sb.append("', subType=");
            return C3269h.a(sb, this.f114537e, '}');
        }
    }

    public MentionEditText(Context context) {
        super(context);
        this.f114518a = new HashMap();
        this.f114525i = false;
        this.f114522e = new ArrayList(5);
        addTextChangedListener(new c(this));
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114518a = new HashMap();
        this.f114525i = false;
        this.f114522e = new ArrayList(5);
        addTextChangedListener(new c(this));
    }

    public final void b(int i7, String str, String str2, boolean z6) {
        a aVar = new a();
        aVar.f114526a = Pattern.compile(str2);
        aVar.f114527b = i7;
        aVar.f114528c = z6;
        ((HashMap) this.f114518a).put(str, aVar);
    }

    public void c() {
        this.f114520c = false;
        List<g> list = this.f114522e;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            Map<String, a> map = this.f114518a;
            if (map == null) {
                return;
            }
            Iterator it = ((HashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                String str = (String) ((Map.Entry) it.next()).getKey();
                f fVar = this.f114523f;
                if (fVar != null) {
                    fVar.c(str, false, null, null);
                }
            }
            return;
        }
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class)) {
            if (!this.f114525i) {
                text.removeSpan(foregroundColorSpan);
            } else if (foregroundColorSpan.getForegroundColor() == -11497268) {
                text.removeSpan(foregroundColorSpan);
            }
        }
        String string = text.toString();
        for (Map.Entry entry : ((HashMap) this.f114518a).entrySet()) {
            String str2 = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            aVar.f114529d = 0;
            f fVar2 = this.f114523f;
            boolean zB = fVar2 != null ? fVar2.b(str2) : false;
            f fVar3 = this.f114523f;
            int iA = fVar3 != null ? fVar3.a(str2) : 9999;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Matcher matcher = aVar.f114526a.matcher(string);
            int i7 = -1;
            while (matcher.find()) {
                String strGroup = matcher.group();
                arrayList.add(strGroup);
                if (zB) {
                    if (aVar.f114529d < iA) {
                        f fVar4 = this.f114523f;
                        if (fVar4 != null ? fVar4.d(str2, strGroup) : false) {
                            aVar.f114529d++;
                        }
                    }
                }
                int iIndexOf = i7 != -1 ? string.indexOf(strGroup, i7) : string.indexOf(strGroup);
                int length = strGroup.length() + iIndexOf;
                text.setSpan(new ForegroundColorSpan(((a) entry.getValue()).f114527b), iIndexOf, length, 33);
                ((ArrayList) this.f114522e).add(new g(iIndexOf, length));
                arrayList2.add(new ColoredTextBean(strGroup, iIndexOf, length));
                i7 = length;
            }
            f fVar5 = this.f114523f;
            if (fVar5 != null) {
                fVar5.c(str2, false, arrayList, arrayList2);
            }
        }
    }

    public boolean d(g gVar) {
        return false;
    }

    public boolean e(int i7, int i8) {
        return false;
    }

    public void f(int i7, int i8) {
    }

    public void g(g gVar) {
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new b(this, super.onCreateInputConnection(editorInfo), this);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i7, int i8) {
        g gVar;
        super.onSelectionChanged(i7, i8);
        g gVar2 = this.f114521d;
        if (gVar2 != null) {
            int i9 = gVar2.f114534b;
            int i10 = gVar2.f114533a;
            if (i10 == i7 && i9 == i8) {
                return;
            }
            if (i10 == i8 && i9 == i7) {
                return;
            }
        }
        if (e(i7, i8)) {
            this.f114520c = false;
        }
        List<g> list = this.f114522e;
        if (list == null) {
            gVar = null;
        } else {
            for (g gVar3 : (ArrayList) list) {
                if (gVar3.a(i7, i8)) {
                    break;
                }
            }
            gVar3 = null;
        }
        if (gVar3 != null && gVar3.f114534b == i8) {
            this.f114520c = false;
        }
        f(i7, i8);
        List<g> list2 = this.f114522e;
        if (list2 != null) {
            Iterator it = ((ArrayList) list2).iterator();
            while (true) {
                gVar = null;
                if (!it.hasNext()) {
                    break;
                }
                gVar = (g) it.next();
                int i11 = gVar.f114534b;
                int i12 = gVar.f114533a;
                if ((i7 > i12 && i7 < i11) || (i8 > i12 && i8 < i11)) {
                    break;
                }
            }
        } else {
            gVar = null;
        }
        if (gVar == null || d(gVar)) {
            return;
        }
        int i13 = gVar.f114534b;
        int i14 = gVar.f114533a;
        if (i7 == i8) {
            setSelection((i7 - i14) - (i13 - i7) >= 0 ? i13 : i14);
            return;
        }
        if (i8 < i13) {
            setSelection(i7, i13);
        }
        if (i7 > i14) {
            setSelection(i14, i8);
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        c();
    }

    public void setOnAfterTextChangedListener(d dVar) {
    }

    public void setOnMentionInputListener(e eVar) {
        this.f114524g = eVar;
    }

    public void setOnPatternMatchListener(f fVar) {
        this.f114523f = fVar;
    }

    public void setRemoveTargetColor(boolean z6) {
        this.f114525i = z6;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.f114519b == null) {
            this.f114519b = new RunnableC6553g(this, 1);
        }
        post(this.f114519b);
    }

    public void setVotePatternText(String str) {
        this.h = str;
    }
}

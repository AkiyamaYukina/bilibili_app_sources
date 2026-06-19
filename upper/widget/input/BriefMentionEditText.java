package com.bilibili.upper.widget.input;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bilibili.studio.comm.manager.v;
import com.bilibili.upper.widget.input.MentionEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import tw0.f;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/BriefMentionEditText.class */
public class BriefMentionEditText extends MentionEditText {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f114508o = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<MentionEditText.g> f114509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f114510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f114511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f114512n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/BriefMentionEditText$a.class */
    public final class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BriefMentionEditText f114513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BriefMentionEditText f114514b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BriefMentionEditText briefMentionEditText, MentionEditText.b bVar, BriefMentionEditText briefMentionEditText2) {
            super(bVar, true);
            this.f114514b = briefMentionEditText;
            this.f114513a = briefMentionEditText2;
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
            int selectionStart;
            Editable text;
            MentionEditText.g gVar;
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (selectionStart = this.f114513a.getSelectionStart()) == this.f114513a.getSelectionEnd() && selectionStart > 0 && (text = this.f114513a.getText()) != null && text.length() > 0 && selectionStart <= text.length()) {
                int i7 = selectionStart - 1;
                if (text.charAt(i7) == "￼".charAt(0)) {
                    BriefMentionEditText briefMentionEditText = this.f114514b;
                    int i8 = BriefMentionEditText.f114508o;
                    List<MentionEditText.g> list = briefMentionEditText.f114522e;
                    if (list != null) {
                        Iterator it = ((ArrayList) list).iterator();
                        while (true) {
                            gVar = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            gVar = (MentionEditText.g) it.next();
                            if (gVar.f114534b == i7 && gVar.b()) {
                                break;
                            }
                        }
                    } else {
                        gVar = null;
                    }
                    if (gVar != null && gVar.b()) {
                        BriefMentionEditText briefMentionEditText2 = this.f114514b;
                        briefMentionEditText2.f114520c = true;
                        briefMentionEditText2.f114521d = gVar;
                        try {
                            this.f114513a.setSelection(gVar.f114533a, gVar.f114534b);
                            return true;
                        } catch (Exception e7) {
                            e7.printStackTrace();
                            return true;
                        }
                    }
                }
            }
            return super.sendKeyEvent(keyEvent);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/BriefMentionEditText$b.class */
    public final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f114515a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BriefMentionEditText f114516b;

        public b(BriefMentionEditText briefMentionEditText) {
            this.f114516b = briefMentionEditText;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            this.f114515a = charSequence.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0412  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x05ca  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0293  */
        /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r19v13, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r19v16 */
        /* JADX WARN: Type inference failed for: r19v4, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r19v5 */
        /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onTextChanged(java.lang.CharSequence r9, int r10, int r11, int r12) {
            /*
                Method dump skipped, instruction units count: 1864
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.widget.input.BriefMentionEditText.b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/input/BriefMentionEditText$c.class */
    public interface c {
        void a(int i7);

        default void b(int i7, String str) {
        }
    }

    public BriefMentionEditText(Context context) {
        super(context);
        this.f114512n = true;
        b bVar = new b(this);
        this.f114511m = bVar;
        addTextChangedListener(bVar);
    }

    public BriefMentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114512n = true;
        b bVar = new b(this);
        this.f114511m = bVar;
        addTextChangedListener(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // com.bilibili.upper.widget.input.MentionEditText
    public final void c() {
        int i7;
        int i8;
        int i9;
        if (!this.f114512n) {
            return;
        }
        int i10 = 0;
        this.f114520c = false;
        List<MentionEditText.g> list = this.f114522e;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            Map<String, MentionEditText.a> map = this.f114518a;
            if (map == null) {
                return;
            }
            Iterator it = ((HashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                String str = (String) ((Map.Entry) it.next()).getKey();
                MentionEditText.f fVar = this.f114523f;
                if (fVar != null) {
                    fVar.c(str, true, null, null);
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
        int length = string.length();
        Iterator it2 = ((HashMap) this.f114518a).entrySet().iterator();
        while (true) {
            int i11 = i10;
            if (!it2.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str2 = (String) entry.getKey();
            MentionEditText.a aVar = (MentionEditText.a) entry.getValue();
            aVar.f114529d = i11;
            MentionEditText.f fVar2 = this.f114523f;
            ?? B6 = fVar2 != null ? fVar2.b(str2) : i11;
            MentionEditText.f fVar3 = this.f114523f;
            int iA = fVar3 != null ? fVar3.a(str2) : 9999;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Matcher matcher = aVar.f114526a.matcher(string);
            if (str2.equals("#")) {
                List<MentionEditText.g> list2 = this.f114509k;
                int i12 = i11;
                Editable editable = text;
                int i13 = length;
                Iterator it3 = it2;
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = arrayList;
                if (list2 != null) {
                    i12 = i11;
                    editable = text;
                    i13 = length;
                    it3 = it2;
                    arrayList3 = arrayList2;
                    arrayList4 = arrayList;
                    if (!list2.isEmpty()) {
                        Iterator<MentionEditText.g> it4 = this.f114509k.iterator();
                        while (true) {
                            i12 = i11;
                            editable = text;
                            i13 = length;
                            it3 = it2;
                            arrayList3 = arrayList2;
                            arrayList4 = arrayList;
                            if (!it4.hasNext()) {
                                break;
                            }
                            MentionEditText.g next = it4.next();
                            int i14 = next.f114533a;
                            if (i14 >= 0 && i14 <= (i9 = next.f114534b) && i9 <= length) {
                                String strSubstring = string.substring(i14, i9);
                                arrayList.add(strSubstring);
                                text.setSpan(new ForegroundColorSpan(((MentionEditText.a) entry.getValue()).f114527b), i14, i9, 33);
                                ((ArrayList) this.f114522e).add(new MentionEditText.g(str2, i14, i9, 2, next.f114535c));
                                arrayList2.add(new MentionEditText.ColoredTextBean(strSubstring, i14, i9, next.f114535c));
                            }
                            i11 = 0;
                        }
                    }
                }
                i7 = i13;
                it2 = it3;
                arrayList2 = arrayList3;
                arrayList = arrayList4;
                i8 = i12;
                text = editable;
            } else {
                i7 = length;
                int i15 = iA;
                int i16 = -1;
                while (matcher.find()) {
                    String strGroup = matcher.group();
                    arrayList.add(strGroup);
                    if (B6 != 0) {
                        if (aVar.f114529d < i15) {
                            MentionEditText.f fVar4 = this.f114523f;
                            if (fVar4 != null ? fVar4.d(str2, strGroup) : false) {
                                aVar.f114529d++;
                            }
                        }
                    }
                    int iIndexOf = i16 != -1 ? string.indexOf(strGroup, i16) : string.indexOf(strGroup);
                    int length2 = strGroup.length() + iIndexOf;
                    text.setSpan(new ForegroundColorSpan(((MentionEditText.a) entry.getValue()).f114527b), iIndexOf, length2, 33);
                    ((ArrayList) this.f114522e).add(new MentionEditText.g(str2, iIndexOf, length2, 2, false));
                    arrayList2.add(new MentionEditText.ColoredTextBean(strGroup, iIndexOf, length2, false));
                    i16 = length2;
                }
                i8 = 0;
            }
            MentionEditText.f fVar5 = this.f114523f;
            if (fVar5 != null) {
                fVar5.c(str2, true, arrayList, arrayList2);
            }
            i10 = i8;
            length = i7;
        }
    }

    @Override // com.bilibili.upper.widget.input.MentionEditText
    public final boolean d(MentionEditText.g gVar) {
        return gVar.b();
    }

    @Override // com.bilibili.upper.widget.input.MentionEditText
    public final boolean e(int i7, int i8) {
        MentionEditText.g gVar = this.f114521d;
        return (gVar == null || gVar.a(i7, i8)) ? false : true;
    }

    @Override // com.bilibili.upper.widget.input.MentionEditText
    public final void f(int i7, int i8) {
        if (i7 == i8) {
            h(i7, false);
        }
    }

    @Override // com.bilibili.upper.widget.input.MentionEditText
    public final void g(MentionEditText.g gVar) {
        int i7;
        if (gVar.b()) {
            try {
                Editable text = getText();
                if (text == null || (i7 = gVar.f114533a) < 0) {
                    return;
                }
                int length = text.length();
                int i8 = gVar.f114534b;
                if (i8 <= length) {
                    String string = text.subSequence(i7, i8).toString();
                    String strSubstring = string;
                    if (string.startsWith("#")) {
                        strSubstring = string.substring(1);
                    }
                    zG0.a.r();
                    a.a aVar = a.a.a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("tag_name", strSubstring);
                    linkedHashMap.put("experiment_num", "4");
                    v.a(linkedHashMap);
                    f.f127691a.d(false, "creation.new-publish.introduction.tag-delete.click", linkedHashMap);
                }
            } catch (Exception e7) {
            }
        }
    }

    public int getCurHashTagStart() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart != selectionEnd) {
            return -1;
        }
        for (MentionEditText.g gVar : (ArrayList) this.f114522e) {
            if (gVar.a(selectionStart, selectionEnd)) {
                return gVar.f114533a;
            }
        }
        return selectionStart - 1;
    }

    public final void h(int i7, boolean z6) {
        int i8;
        List<MentionEditText.g> list = this.f114522e;
        boolean z7 = false;
        boolean z8 = false;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                z7 = z8;
                if (!it.hasNext()) {
                    break;
                }
                MentionEditText.g gVar = (MentionEditText.g) it.next();
                if (!gVar.a(i7, i7) && gVar.b() && !gVar.f114535c) {
                    z8 = true;
                    gVar.f114535c = true;
                }
            }
        }
        if (z7) {
            List<MentionEditText.g> list2 = this.f114522e;
            if (list2 == null || ((ArrayList) list2).isEmpty()) {
                gH0.b.a("updateFinishHashTags: mRangeArrayList is empty");
                return;
            }
            Editable text = getText();
            if (text == null || TextUtils.isEmpty(text.toString())) {
                gH0.b.a("updateFinishHashTags: editable is null");
                return;
            }
            String string = text.toString();
            int length = string.length();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (MentionEditText.g gVar2 : (ArrayList) this.f114522e) {
                if (gVar2 != null && gVar2.b()) {
                    int i9 = gVar2.f114533a;
                    if (i9 < 0 || (i8 = gVar2.f114534b) < 0 || i9 >= length || i8 > length || i9 >= i8) {
                        gH0.b.a("updateFinishHashTags: invalid range = " + gVar2);
                    } else {
                        try {
                            String strSubstring = string.substring(i9, i8);
                            arrayList.add(strSubstring);
                            arrayList2.add(new MentionEditText.ColoredTextBean(strSubstring, i9, i8, gVar2.f114535c));
                        } catch (Exception e7) {
                            gH0.b.a("updateFinishHashTags: substring failed, range=" + gVar2 + ", error=" + e7);
                        }
                    }
                }
            }
            MentionEditText.f fVar = this.f114523f;
            if (fVar != null) {
                fVar.c("#", z6, arrayList, arrayList2);
            }
        }
    }

    @Override // com.bilibili.upper.widget.input.MentionEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new a(this, (MentionEditText.b) super.onCreateInputConnection(editorInfo), this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i7, Rect rect) {
        super.onFocusChanged(z6, i7, rect);
        if (z6) {
            return;
        }
        h(-1, true);
    }

    public void setOnHashTagInputListener(c cVar) {
        this.f114510l = cVar;
    }
}

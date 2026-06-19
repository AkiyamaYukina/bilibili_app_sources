package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.biligame.component.compose.ChildScope;
import com.bilibili.biligame.ui.pointmall.address.MallAddressManagerActivity;
import com.bilibili.biligame.ui.pointmall.bean.UserAddressBean;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import xs.I;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/v.class */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f106451a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f106452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f106453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f106454d;

    public /* synthetic */ v(BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3, BiliEditorStickerBatchEditFragmentV3.b bVar, CaptionEditText captionEditText) {
        this.f106452b = biliEditorStickerBatchEditFragmentV3;
        this.f106453c = bVar;
        this.f106454d = captionEditText;
    }

    public /* synthetic */ v(List list, ChildScope childScope, MallAddressManagerActivity mallAddressManagerActivity) {
        this.f106452b = list;
        this.f106453c = childScope;
        this.f106454d = mallAddressManagerActivity;
    }

    public final Object invoke(Object obj) {
        String str;
        Object obj2 = this.f106454d;
        Object obj3 = this.f106453c;
        int i7 = 0;
        Object obj4 = this.f106452b;
        switch (this.f106451a) {
            case 0:
                String str2 = (String) obj;
                Context context = ((BiliEditorStickerBatchEditFragmentV3) obj4).getContext();
                if (context != null) {
                    int length = str2.length();
                    BiliEditorStickerBatchEditFragmentV3.b bVar = (BiliEditorStickerBatchEditFragmentV3.b) obj3;
                    CaptionInfo captionInfo = bVar.f106370a;
                    if (length > (captionInfo != null ? captionInfo.txtMax : 0)) {
                        if (captionInfo != null) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            str = String.format(context.getString(2131841809), Arrays.copyOf(new Object[]{Integer.valueOf(captionInfo.txtMax)}, 1));
                        } else {
                            str = null;
                        }
                        ToastHelper.showToastShort(context, str);
                        CaptionInfo captionInfo2 = bVar.f106370a;
                        String strSubstring = captionInfo2 != null ? str2.substring(0, captionInfo2.txtMax) : null;
                        CaptionEditText captionEditText = (CaptionEditText) obj2;
                        captionEditText.setText(strSubstring);
                        int i8 = captionInfo2.txtMax;
                        if (i8 > 0) {
                            captionEditText.setSelection(i8);
                        }
                    }
                }
                break;
            default:
                List list = (List) obj4;
                LazyListScope lazyListScope = (LazyListScope) obj;
                int i9 = MallAddressManagerActivity.Q;
                for (Object obj5 : list) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    UserAddressBean userAddressBean = (UserAddressBean) obj5;
                    lazyListScope.item(Integer.valueOf(userAddressBean.hashCode() + i7), null, ComposableLambdaKt.composableLambdaInstance(1057536597, true, new I(i7, userAddressBean, (ChildScope) obj3, (MallAddressManagerActivity) obj2)));
                    i7++;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

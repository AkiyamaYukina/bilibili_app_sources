package com.bilibili.studio.editor.moudle.templatev2.ui;

import TB0.Z;
import com.bilibili.biligame.api.comment.CommentBanStatus;
import com.bilibili.biligame.business.detail.GameDetailFragment;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.extension.p;
import com.mall.common.extension.MallKtExtensionKt;
import com.mall.data.page.ip.bean.dress.MallIpDressBean;
import com.mall.data.page.ip.bean.dress.MallIpDressImgListBean;
import com.mall.data.page.shopLiveReplay.MallShopLiveReplayGoodsData;
import com.mall.ui.composePage.shopreplay.MallShopLiveReplayFragment;
import com.mall.ui.page.ip.dress.MallIpDressPendantFragment;
import com.mall.ui.page.ip.view.f1;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/e.class */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx_fragment_app_Fragment f108106b;

    public /* synthetic */ e(int i7, androidx_fragment_app_Fragment androidx_fragment_app_fragment) {
        this.f108105a = i7;
        this.f108106b = androidx_fragment_app_fragment;
    }

    public final Object invoke(Object obj) {
        MallIpDressImgListBean mallIpDressImgListBeanP;
        switch (this.f108105a) {
            case 0:
                EditorTemplateTabItemBean editorTemplateTabItemBean = (EditorTemplateTabItemBean) obj;
                BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment = (BiliEditorTemplateMusicFragment) this.f108106b;
                biliEditorTemplateMusicFragment.nf(editorTemplateTabItemBean);
                EditVideoInfo editVideoInfo = biliEditorTemplateMusicFragment.of().f108196d;
                if (editVideoInfo != null) {
                    editVideoInfo.setEditTemplateInfo(editorTemplateTabItemBean);
                }
                k.c cVar = biliEditorTemplateMusicFragment.of().f108198f;
                if (cVar != null) {
                    cVar.f108200b = editorTemplateTabItemBean;
                }
                Qz0.e eVar = biliEditorTemplateMusicFragment.f108093g;
                if (eVar != null) {
                    eVar.f20288d = editorTemplateTabItemBean;
                    eVar.notifyItemRangeChanged(0, eVar.f20287c.size(), 3322);
                }
                Z z6 = biliEditorTemplateMusicFragment.f108088b;
                if (z6 != null) {
                    p.c(z6.f23724k, CollectionsKt.indexOf(biliEditorTemplateMusicFragment.qf().f108122l, editorTemplateTabItemBean), null);
                }
                break;
            case 1:
                MallShopLiveReplayGoodsData mallShopLiveReplayGoodsData = (MallShopLiveReplayGoodsData) obj;
                MallShopLiveReplayFragment mallShopLiveReplayFragment = this.f108106b;
                Map mapSf = mallShopLiveReplayFragment.sf();
                mapSf.put("merchantId", String.valueOf(mallShopLiveReplayGoodsData.getMerchantId()));
                mapSf.put("dh_item_id", String.valueOf(mallShopLiveReplayGoodsData.getItemCode()));
                mapSf.put("one_item_id", String.valueOf(mallShopLiveReplayGoodsData.getContentId()));
                mapSf.put("item_source", String.valueOf(mallShopLiveReplayGoodsData.getItemSourceName()));
                mapSf.put("cardicon", MallKtExtensionKt.isNotNullAndNotEmpty(mallShopLiveReplayGoodsData.getTopLeftLabels()) ? "1" : "0");
                mapSf.put("type", "横滑商品卡");
                KQ0.e.e(2131840086, mapSf);
                mallShopLiveReplayFragment.uf(mallShopLiveReplayGoodsData, mapSf, true);
                break;
            case 2:
                Pair pair = (Pair) obj;
                if (pair != null) {
                    MallIpDressPendantFragment mallIpDressPendantFragment = this.f108106b;
                    com.mall.ui.page.ip.dress.h hVar = mallIpDressPendantFragment.m;
                    if (hVar != null) {
                        Integer dressId = ((MallIpDressImgListBean) pair.getFirst()).getDressId();
                        hVar.O(dressId != null ? dressId.intValue() : -1, ((Number) pair.getSecond()).intValue() == 1);
                    }
                    ToastHelper.showToast(mallIpDressPendantFragment.getContext(), ((Number) pair.getSecond()).intValue() == 1 ? "装扮成功" : "装扮已卸下", 0);
                    f1 f1Var = mallIpDressPendantFragment.r;
                    if (f1Var != null) {
                        f1Var.a.a.uf();
                    }
                    MallIpDressBean mallIpDressBean = mallIpDressPendantFragment.p;
                    com.mall.ui.page.ip.dress.h hVar2 = mallIpDressPendantFragment.m;
                    if (hVar2 != null) {
                        Integer dressId2 = ((MallIpDressImgListBean) pair.getFirst()).getDressId();
                        int iIntValue = -1;
                        if (dressId2 != null) {
                            iIntValue = dressId2.intValue();
                        }
                        mallIpDressImgListBeanP = hVar2.P(iIntValue);
                    } else {
                        mallIpDressImgListBeanP = null;
                    }
                    mallIpDressPendantFragment.rf(mallIpDressBean, mallIpDressImgListBeanP);
                }
                break;
            default:
                ((GameDetailFragment) this.f108106b).f62493l = (CommentBanStatus) obj;
                break;
        }
        return Unit.INSTANCE;
    }
}

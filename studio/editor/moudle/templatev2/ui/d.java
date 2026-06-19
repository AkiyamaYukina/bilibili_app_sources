package com.bilibili.studio.editor.moudle.templatev2.ui;

import TB0.Z;
import com.bilibili.biligame.business.detail.GameDetailFragment;
import com.bilibili.biligame.business.detail.widget.DetailTabLayout;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabBean;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.videoeditor.extension.p;
import com.mall.common.extension.MallKtExtensionKt;
import com.mall.data.page.shopLiveReplay.MallShopLiveReplayGoodsData;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx_fragment_app_Fragment f108104b;

    public /* synthetic */ d(int i7, androidx_fragment_app_Fragment androidx_fragment_app_fragment) {
        this.f108103a = i7;
        this.f108104b = androidx_fragment_app_fragment;
    }

    public final Object invoke(Object obj) {
        switch (this.f108103a) {
            case 0:
                Integer num = (Integer) obj;
                if (num != null) {
                    BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment = (BiliEditorTemplateMusicFragment) this.f108104b;
                    Qz0.h hVar = biliEditorTemplateMusicFragment.f108092f;
                    if (hVar != null) {
                        hVar.f20298c = num.intValue();
                        hVar.notifyItemRangeChanged(0, hVar.getItemCount(), 1);
                    }
                    Z z6 = biliEditorTemplateMusicFragment.f108088b;
                    if (z6 != null) {
                        p.c(z6.f23725l, num.intValue(), null);
                    }
                    k.c cVar = biliEditorTemplateMusicFragment.of().f108198f;
                    if (cVar != null) {
                        List<EditorTemplateTabBean> value = biliEditorTemplateMusicFragment.qf().f108115d.getValue();
                        String name = null;
                        if (value != null) {
                            EditorTemplateTabBean editorTemplateTabBean = (EditorTemplateTabBean) CollectionsKt.getOrNull(value, num.intValue());
                            name = null;
                            if (editorTemplateTabBean != null) {
                                name = editorTemplateTabBean.getName();
                            }
                        }
                        cVar.f108199a = name;
                    }
                }
                break;
            case 1:
                MallShopLiveReplayGoodsData mallShopLiveReplayGoodsData = (MallShopLiveReplayGoodsData) obj;
                Map mapSf = this.f108104b.sf();
                mapSf.put("merchantId", String.valueOf(mallShopLiveReplayGoodsData.getMerchantId()));
                mapSf.put("dh_item_id", String.valueOf(mallShopLiveReplayGoodsData.getItemCode()));
                mapSf.put("one_item_id", String.valueOf(mallShopLiveReplayGoodsData.getContentId()));
                mapSf.put("item_source", String.valueOf(mallShopLiveReplayGoodsData.getItemSourceName()));
                mapSf.put("cardicon", MallKtExtensionKt.isNotNullAndNotEmpty(mallShopLiveReplayGoodsData.getTopLeftLabels()) ? "1" : "0");
                mapSf.put("type", "横滑商品卡");
                KQ0.e.k(2131840090, mapSf);
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                GameDetailFragment gameDetailFragment = (GameDetailFragment) this.f108104b;
                gameDetailFragment.f62492k = zBooleanValue;
                DetailTabLayout detailTabLayout = gameDetailFragment.f62487e;
                if (detailTabLayout != null) {
                    detailTabLayout.setCommented(bool.booleanValue());
                }
                gameDetailFragment.mf();
                break;
        }
        return Unit.INSTANCE;
    }
}

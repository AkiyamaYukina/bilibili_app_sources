package com.bilibili.relation.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.bapis.bilibili.relation.interfaces.FollowingReq;
import com.bapis.bilibili.relation.interfaces.ModifyRelationReply;
import com.bapis.bilibili.relation.interfaces.RelationInterfaceMoss;
import com.bilibili.api.BiliApiException;
import com.bilibili.base.MainThread;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.relation.api.RelationApiCallback;
import com.bilibili.relation.api.ResponseChangeRelation;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/RelationApiManager.class */
public class RelationApiManager {
    public static final int PAGE_SIZE = 20;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/RelationApiManager$a.class */
    public final class a implements MossResponseHandler<ModifyRelationReply> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RelationApiCallback f86019a;

        public a(RelationApiCallback relationApiCallback) {
            this.f86019a = relationApiCallback;
        }

        public final void onError(@Nullable final MossException mossException) {
            final RelationApiCallback relationApiCallback = this.f86019a;
            MainThread.runOnMainThread(new Runnable(relationApiCallback, mossException) { // from class: Es0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final RelationApiCallback f4699a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MossException f4700b;

                {
                    this.f4699a = relationApiCallback;
                    this.f4700b = mossException;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RelationApiCallback relationApiCallback2 = this.f4699a;
                    BusinessException businessException = this.f4700b;
                    if (relationApiCallback2 == null || relationApiCallback2.isCancel()) {
                        return;
                    }
                    if (businessException instanceof BusinessException) {
                        relationApiCallback2.onError(new BiliApiException(businessException.getCode(), businessException.getMessage(), businessException.getCause()));
                    } else {
                        relationApiCallback2.onError(businessException);
                    }
                }
            });
        }

        public final void onNext(@Nullable Object obj) {
            final RelationApiCallback relationApiCallback = this.f86019a;
            final int i7 = 0;
            MainThread.runOnMainThread(new Runnable(relationApiCallback, i7) { // from class: Es0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f4701a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f4702b;

                {
                    this.f4701a = i7;
                    this.f4702b = relationApiCallback;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f4701a) {
                        case 0:
                            RelationApiCallback relationApiCallback2 = (RelationApiCallback) this.f4702b;
                            if (relationApiCallback2 != null && !relationApiCallback2.isCancel()) {
                                relationApiCallback2.onDataSuccess(new ResponseChangeRelation());
                                break;
                            }
                            break;
                        default:
                            com.bilibili.bililive.camera.a.c((com.bilibili.bililive.camera.a) this.f4702b);
                            break;
                    }
                }
            });
        }
    }

    @Deprecated
    public static void addAuthorAttention(String str, long j7, int i7, BiliApiDataCallback<Void> biliApiDataCallback) {
        if (ConfigManager.isHitFF("ff_relation_risk_control_enable")) {
            modifyRelation(j7, 1, i7, "", "", "", "", new Es0.a(biliApiDataCallback));
        } else {
            ((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelationV2(str, j7, 1, i7, null, null, null, null, PageViewTracker.getInstance().currentPolarisActionId()).enqueue(biliApiDataCallback);
        }
    }

    @Deprecated
    public static void addAuthorAttention(String str, long j7, int i7, String str2, BiliApiDataCallback<Void> biliApiDataCallback) {
        if (ConfigManager.isHitFF("ff_relation_risk_control_enable")) {
            modifyRelation(j7, 1, i7, "", "", str2, "", new Es0.a(biliApiDataCallback));
        } else {
            ((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelationV2(str, j7, 1, i7, str2, null, null, null, PageViewTracker.getInstance().currentPolarisActionId()).enqueue(biliApiDataCallback);
        }
    }

    @Deprecated
    public static void addAuthorAttentionV2(String str, long j7, int i7, String str2, String str3, String str4, Map<String, String> map, BiliApiDataCallback<Void> biliApiDataCallback) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), (Object) entry.getValue());
                }
            }
        }
        if (ConfigManager.isHitFF("ff_relation_risk_control_enable")) {
            modifyRelation(j7, 1, i7, str3, str4, str2, jSONObject.toString(), new Es0.a(biliApiDataCallback));
        } else {
            ((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelationV2(str, j7, 1, i7, str2, str3, str4, jSONObject.toString(), PageViewTracker.getInstance().currentPolarisActionId()).enqueue(biliApiDataCallback);
        }
    }

    public static void addSpecial(String str, @NonNull String str2, BiliApiDataCallback<Void> biliApiDataCallback) {
        ((RelationService) ServiceGenerator.createService(RelationService.class)).addSpecial(str, str2).enqueue(biliApiDataCallback);
    }

    @Deprecated
    public static void addToBlackList(String str, long j7, int i7, BiliApiDataCallback<Void> biliApiDataCallback) {
        if (ConfigManager.isHitFF("ff_relation_risk_control_enable")) {
            modifyRelation(j7, 5, i7, "", "", "", "", new Es0.a(biliApiDataCallback));
        } else {
            ((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelationV2(str, j7, 5, i7, null, null, null, null, PageViewTracker.getInstance().currentPolarisActionId()).enqueue(biliApiDataCallback);
        }
    }

    @Deprecated
    public static void deleteAuthorAttention(String str, long j7, int i7, String str2, BiliApiDataCallback<Void> biliApiDataCallback) {
        if (ConfigManager.isHitFF("ff_relation_risk_control_enable")) {
            modifyRelation(j7, 2, i7, "", "", str2, "", new Es0.a(biliApiDataCallback));
        } else {
            ((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelationV2(str, j7, 2, i7, str2, null, null, null, PageViewTracker.getInstance().currentPolarisActionId()).enqueue(biliApiDataCallback);
        }
    }

    @Deprecated
    public static void deleteAuthorAttentionV2(String str, long j7, int i7, String str2, String str3, String str4, HashMap<String, String> map, BiliApiDataCallback<Void> biliApiDataCallback) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), (Object) entry.getValue());
                }
            }
        }
        if (ConfigManager.isHitFF("ff_relation_risk_control_enable")) {
            modifyRelation(j7, 2, i7, str3, str4, str2, jSONObject.toString(), new Es0.a(biliApiDataCallback));
        } else {
            ((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelationV2(str, j7, 2, i7, str2, str3, str4, jSONObject.toString(), PageViewTracker.getInstance().currentPolarisActionId()).enqueue(biliApiDataCallback);
        }
    }

    public static void getBlackList(String str, BiliApiDataCallback<AttentionList> biliApiDataCallback) {
        ((RelationService) ServiceGenerator.createService(RelationService.class)).getBlackList(str).enqueue(biliApiDataCallback);
    }

    public static void getRelation(String str, String str2, BiliApiDataCallback<Attention> biliApiDataCallback) {
        ((RelationService) ServiceGenerator.createService(RelationService.class)).getRelation(str, str2).enqueue(biliApiDataCallback);
    }

    public static void modifyRelation(long j7, int i7, int i8, String str, String str2, String str3, String str4, RelationApiCallback<ResponseChangeRelation> relationApiCallback) {
        RelationInterfaceMoss relationInterfaceMoss = new RelationInterfaceMoss();
        FollowingReq.b actValue = FollowingReq.newBuilder().setFid(j7).setActValue(i7);
        String str5 = str;
        if (str == null) {
            str5 = "";
        }
        FollowingReq.b fromSpmid = actValue.setFromSpmid(str5);
        String str6 = str2;
        if (str2 == null) {
            str6 = "";
        }
        FollowingReq.b fromScmid = fromSpmid.setFromScmid(str6);
        String str7 = str3;
        if (str3 == null) {
            str7 = "";
        }
        FollowingReq.b source = fromScmid.setSpmid(str7).setSource(i8);
        String str8 = str4;
        if (str4 == null) {
            str8 = "";
        }
        relationInterfaceMoss.modifyRelation(source.setExtendContent(str8).setActionId(PageViewTracker.getInstance().currentPolarisActionId() == null ? "" : PageViewTracker.getInstance().currentPolarisActionId()).build(), new a(relationApiCallback));
    }

    @Deprecated
    public static void removeFromBlackList(String str, long j7, int i7, BiliApiDataCallback<Void> biliApiDataCallback) {
        if (ConfigManager.isHitFF("ff_relation_risk_control_enable")) {
            modifyRelation(j7, 6, i7, "", "", "", "", new Es0.a(biliApiDataCallback));
        } else {
            ((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelationV2(str, j7, 6, i7, null, null, null, null, PageViewTracker.getInstance().currentPolarisActionId()).enqueue(biliApiDataCallback);
        }
    }

    public static void removeSpecial(String str, @NonNull String str2, BiliApiDataCallback<Void> biliApiDataCallback) {
        ((RelationService) ServiceGenerator.createService(RelationService.class)).deleteSpecial(str, str2).enqueue(biliApiDataCallback);
    }
}

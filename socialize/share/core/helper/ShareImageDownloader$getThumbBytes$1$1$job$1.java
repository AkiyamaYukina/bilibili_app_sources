package com.bilibili.socialize.share.core.helper;

import Hv0.h;
import android.graphics.Point;
import c6.Q;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.socialize.share.core.SocializeMedia;
import com.bilibili.socialize.share.core.helper.ShareImageDownloader;
import com.bilibili.socialize.share.core.shareparam.BaseShareParam;
import com.bilibili.socialize.share.core.shareparam.ShareImage;
import com.bilibili.socialize.share.core.shareparam.ShareParamAudio;
import com.bilibili.socialize.share.core.shareparam.ShareParamImage;
import com.bilibili.socialize.share.core.shareparam.ShareParamMinProgram;
import com.bilibili.socialize.share.core.shareparam.ShareParamPureImage;
import com.bilibili.socialize.share.core.shareparam.ShareParamText;
import com.bilibili.socialize.share.core.shareparam.ShareParamVideo;
import com.bilibili.socialize.share.core.shareparam.ShareParamWebPage;
import com.huawei.caas.messageservice.HwShareUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/ShareImageDownloader$getThumbBytes$1$1$job$1.class */
public final class ShareImageDownloader$getThumbBytes$1$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ShareImage $image;
    int label;
    final ShareImageDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareImageDownloader$getThumbBytes$1$1$job$1(ShareImageDownloader shareImageDownloader, ShareImage shareImage, Continuation<? super ShareImageDownloader$getThumbBytes$1$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = shareImageDownloader;
        this.$image = shareImage;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareImageDownloader$getThumbBytes$1$1$job$1(this.this$0, this.$image, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ShareImageDownloader shareImageDownloader = this.this$0;
        ShareImage shareImage = this.$image;
        SocializeMedia socializeMedia = shareImageDownloader.f104987b;
        int i7 = socializeMedia == null ? -1 : ShareImageDownloader.a.f104990a[socializeMedia.ordinal()];
        if (i7 == 1 || i7 == 2) {
            Pv0.b.c("ShareImageDownloader", "build Wechat thumb");
            BaseShareParam baseShareParam = shareImageDownloader.f104988c;
            if (baseShareParam != null && !(baseShareParam instanceof ShareParamText)) {
                if ((baseShareParam instanceof ShareParamImage) || (baseShareParam instanceof ShareParamPureImage)) {
                    if (shareImage != null) {
                        b bVar = shareImageDownloader.f104986a;
                        shareImage.f105016e = bVar != null ? bVar.a(shareImage) : new byte[0];
                    }
                    BaseShareParam baseShareParam2 = shareImageDownloader.f104988c;
                    Pv0.b.c("ShareImageDownloader", "is ShareParamImage: " + (baseShareParam2 instanceof ShareParamImage) + ", is ShareParamPureImage: " + (baseShareParam2 instanceof ShareParamPureImage));
                } else {
                    boolean z6 = baseShareParam instanceof ShareParamVideo;
                    if (z6 || (baseShareParam instanceof ShareParamWebPage) || (baseShareParam instanceof ShareParamAudio)) {
                        boolean z7 = baseShareParam instanceof ShareParamWebPage;
                        boolean z8 = baseShareParam instanceof ShareParamAudio;
                        StringBuilder sbA = Q.a("is ShareParamVideo: ", ", is ShareParamWebPage: ", ", is ShareParamAudio: ", z6, z7);
                        sbA.append(z8);
                        Pv0.b.c("ShareImageDownloader", sbA.toString());
                        Qv0.a aVar = new Qv0.a();
                        aVar.f20221a = 100;
                        aVar.f20222b = 100;
                        aVar.f20224d = 2;
                        b bVar2 = shareImageDownloader.f104986a;
                        if (bVar2 != null && shareImage != null) {
                            shareImage.f105016e = bVar2.b(shareImage, 30720, aVar);
                        }
                    } else {
                        boolean z9 = baseShareParam instanceof ShareParamMinProgram;
                        if (z9) {
                            Pv0.b.c("ShareImageDownloader", "is ShareParamMinProgram: " + z9);
                            b bVar3 = shareImageDownloader.f104986a;
                            if (bVar3 != null) {
                                Qv0.a aVar2 = new Qv0.a();
                                aVar2.f20221a = BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_TROUSER_LEG_SEGMENT_BLUR;
                                aVar2.f20222b = 600;
                                aVar2.f20224d = 2;
                                aVar2.f20223c = true;
                                if (shareImage != null) {
                                    shareImage.f105016e = bVar3.b(shareImage, 117760, aVar2);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i7 == 3) {
            Pv0.b.c("ShareImageDownloader", "build HUAWEI thumb");
            HwShareUtils.ShareTypeEnum shareTypeEnum = HwShareUtils.ShareTypeEnum.SHARE_WEBPAGE_MSG;
            AN0.b bVar4 = h.f8811a;
            Point pointA = bVar4 != null ? bVar4.a(shareTypeEnum) : null;
            Qv0.a aVar3 = new Qv0.a();
            aVar3.f20221a = pointA != null ? pointA.x : 100;
            int i8 = 100;
            if (pointA != null) {
                i8 = pointA.y;
            }
            aVar3.f20222b = i8;
            if (shareImage != null) {
                b bVar5 = shareImageDownloader.f104986a;
                shareImage.f105016e = bVar5 != null ? bVar5.b(shareImage, 32768, aVar3) : new byte[0];
            }
        } else if (i7 == 4) {
            Pv0.b.c("ShareImageDownloader", "build SINA thumb");
            if (shareImage != null) {
                b bVar6 = shareImageDownloader.f104986a;
                shareImage.f105016e = bVar6 != null ? bVar6.a(shareImage) : null;
            }
        }
        Integer numValueOf = null;
        if (shareImage != null) {
            byte[] bArr = shareImage.f105016e;
            numValueOf = null;
            if (bArr != null) {
                numValueOf = Integer.valueOf(bArr.length);
            }
        }
        Pv0.b.c("ShareImageDownloader", "build Thumb finish, size = " + numValueOf);
        return Unit.INSTANCE;
    }
}

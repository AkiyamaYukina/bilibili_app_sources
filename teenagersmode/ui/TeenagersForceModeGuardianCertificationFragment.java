package com.bilibili.teenagersmode.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.interfaces.v1.FacialRecognitionVerifyFrom;
import com.bapis.bilibili.app.interfaces.v1.FacialRecognitionVerifyReply;
import com.bapis.bilibili.app.interfaces.v1.FacialRecognitionVerifyReq;
import com.bilibili.bililive.room.ui.roomv3.gift.G;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.biliid.api.BiliIds;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.teenagersmode.c;
import com.bilibili.teenagersmode.utils.TeenagersRouter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersForceModeGuardianCertificationFragment.class */
@StabilityInferred(parameters = 0)
public final class TeenagersForceModeGuardianCertificationFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersForceModeGuardianCertificationFragment$a.class */
    public static final class a implements MossResponseHandler<FacialRecognitionVerifyReply> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenagersForceModeGuardianCertificationFragment f110610a;

        public a(TeenagersForceModeGuardianCertificationFragment teenagersForceModeGuardianCertificationFragment) {
            this.f110610a = teenagersForceModeGuardianCertificationFragment;
        }

        public final void onCompleted() {
            com.bilibili.teenagersmode.c cVar = c.C1213c.f110575a;
            TeenagersForceModeGuardianCertificationFragment teenagersForceModeGuardianCertificationFragment = this.f110610a;
            cVar.o(teenagersForceModeGuardianCertificationFragment.getContext(), false);
            com.bilibili.teenagersmode.c.c(teenagersForceModeGuardianCertificationFragment.getContext(), null);
            Neurons.reportExposure(false, "main.teenagermodel.enter-detail.force-close-success.show");
            ToastHelper.showToast(teenagersForceModeGuardianCertificationFragment.getContext(), 2131856007, 0);
        }

        public final void onError(MossException mossException) {
            BusinessException businessException;
            String message;
            boolean z6 = mossException instanceof BusinessException;
            TeenagersForceModeGuardianCertificationFragment teenagersForceModeGuardianCertificationFragment = this.f110610a;
            if (z6 && ((message = (businessException = (BusinessException) mossException).getMessage()) == null || message.length() == 0)) {
                ToastHelper.showToast(teenagersForceModeGuardianCertificationFragment.getContext(), businessException.getMessage(), 0);
            } else {
                ToastHelper.showToast(teenagersForceModeGuardianCertificationFragment.getContext(), 2131856000, 0);
            }
        }

        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 10086 && i8 == -1) {
            Integer integer = BundleUtil.getInteger(getArguments(), "state", new Integer[0]);
            if (integer == null || integer.intValue() != 5) {
                if (integer != null && integer.intValue() == 8 && intent != null && intent.hasExtra("guardianVerified") && intent.getBooleanExtra("guardianVerified", true)) {
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    fragmentActivityRequireActivity.setResult(-1);
                    fragmentActivityRequireActivity.finish();
                    return;
                }
                return;
            }
            if (intent == null || !intent.hasExtra("isEnter") || intent.getBooleanExtra("isEnter", true)) {
                return;
            }
            vD0.d dVar = vD0.d.a;
            FacialRecognitionVerifyFrom facialRecognitionVerifyFrom = FacialRecognitionVerifyFrom.VerifyFromGuardian;
            a aVar = new a(this);
            dVar.getClass();
            vD0.d.b.facialRecognitionVerify(FacialRecognitionVerifyReq.newBuilder().setFrom(facialRecognitionVerifyFrom).setDeviceToken(BiliIds.buvidServer()).build(), vD0.d.a(aVar));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == 2131298954) {
            Integer integer = BundleUtil.getInteger(getArguments(), "state", new Integer[0]);
            Neurons.reportClick(false, (integer != null && integer.intValue() == 8) ? "main.teenagermodel.enter-detail.logout-parents-verify.click" : "main.teenagermodel.enter-detail.parents-verify.click");
            BLRouter.routeTo(new RouteRequest.Builder(TeenagersRouter.a()).requestCode(10086).extras(new G(2, this)).build(), this);
        } else if (id == 2131298957) {
            Integer integer2 = BundleUtil.getInteger(getArguments(), "state", new Integer[0]);
            Neurons.reportClick(false, (integer2 != null && integer2.intValue() == 8) ? "main.teenagermodel.enter-detail.logout-customerservice.click" : "main.teenagermodel.enter-detail.customerservice.click");
            BLRouter.routeTo(new RouteRequest.Builder("bilibili://user_center/feedback").build(), this);
            requireActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131500137, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r6, @org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.teenagersmode.ui.TeenagersForceModeGuardianCertificationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}

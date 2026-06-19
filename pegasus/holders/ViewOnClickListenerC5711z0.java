package com.bilibili.pegasus.holders;

import android.view.View;
import com.bilibili.bilipay.base.entity.ChannelInfo;
import com.bilibili.bilipay.base.entity.DcepEntity;
import com.bilibili.ship.theseus.ugc.endpage.qoe.q;
import java.util.Iterator;
import kotlin.text.StringsKt;
import op0.C8249a;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/z0.class */
public final /* synthetic */ class ViewOnClickListenerC5711z0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f78116c;

    public /* synthetic */ ViewOnClickListenerC5711z0(int i7, Object obj, Object obj2) {
        this.f78114a = i7;
        this.f78115b = obj;
        this.f78116c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object next;
        switch (this.f78114a) {
            case 0:
                fp0.m mVar = (fp0.m) this.f78115b;
                LargeCoverV9Holder largeCoverV9Holder = (LargeCoverV9Holder) this.f78116c;
                jp0.e eVarG = mVar.g();
                String strO = eVarG != null ? eVarG.o() : null;
                if (strO == null || StringsKt.isBlank(strO)) {
                    C8249a.h(largeCoverV9Holder, largeCoverV9Holder, null, null, "0", null, false, false, false, false, null, 2038);
                } else {
                    C8249a.i(largeCoverV9Holder, mVar, mVar.g());
                }
                break;
            case 1:
                q.d.a aVar = (q.d.a) this.f78115b;
                q.d dVar = (q.d) this.f78116c;
                int bindingAdapterPosition = aVar.getBindingAdapterPosition();
                if (dVar.f96757b.contains(Integer.valueOf(bindingAdapterPosition))) {
                    dVar.f96757b.remove(Integer.valueOf(bindingAdapterPosition));
                } else {
                    dVar.f96757b.add(Integer.valueOf(bindingAdapterPosition));
                }
                dVar.notifyDataSetChanged();
                break;
            default:
                ChannelInfo channelInfo = (ChannelInfo) this.f78115b;
                dO.e eVar = (dO.e) this.f78116c;
                Iterator it = channelInfo.subWalletList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((DcepEntity) next).isCheck()) {
                        }
                    } else {
                        next = null;
                    }
                }
                DcepEntity dcepEntity = (DcepEntity) next;
                if (dcepEntity != null) {
                    eVar.a.addProperty("dcepBankCode", String.valueOf(dcepEntity.getDcepBankCode()));
                    eVar.d.invoke();
                }
                break;
        }
    }
}

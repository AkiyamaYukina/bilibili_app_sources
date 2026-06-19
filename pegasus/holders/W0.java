package com.bilibili.pegasus.holders;

import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bilibili.music.podcast.fragment.MusicPodcastSecondaryFavFragment;
import com.bilibili.playset.playlist.search2.CollectionSearchFragment;
import com.bilibili.upper.module.manuscript.bean.AuditReason;
import gI0.C7263m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import op0.C8249a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/W0.class */
public final /* synthetic */ class W0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f77640b;

    public /* synthetic */ W0(Object obj, int i7) {
        this.f77639a = i7;
        this.f77640b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Unit unit;
        C7263m.b bVar;
        switch (this.f77639a) {
            case 0:
                c1 c1Var = (c1) this.f77640b;
                fp0.w wVar = (fp0.w) c1Var.getBindData();
                if (wVar != null) {
                    C8249a.c(c1Var, wVar);
                }
                break;
            case 1:
                CollectionSearchFragment collectionSearchFragment = (CollectionSearchFragment) this.f77640b;
                FragmentManager fragmentManager = collectionSearchFragment.getFragmentManager();
                if (fragmentManager != null) {
                    if (fragmentManager.getBackStackEntryCount() > 0) {
                        fragmentManager.popBackStack();
                        unit = Unit.INSTANCE;
                    } else {
                        FragmentActivity fragmentActivityP3 = collectionSearchFragment.p3();
                        if (fragmentActivityP3 != null) {
                            fragmentActivityP3.finish();
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                    }
                    if (unit != null) {
                    }
                }
                FragmentActivity fragmentActivityP32 = collectionSearchFragment.p3();
                if (fragmentActivityP32 != null) {
                    fragmentActivityP32.onBackPressed();
                }
                break;
            case 2:
                C7263m.a aVar = (C7263m.a) this.f77640b;
                if (!com.bilibili.studio.videoeditor.util.V.c()) {
                    int i7 = aVar.f119879u;
                    C7263m c7263m = aVar.f119883y;
                    AuditReason auditReason = (AuditReason) CollectionsKt.getOrNull(c7263m.f119854a, i7);
                    if (auditReason != null && (bVar = (C7263m.b) CollectionsKt.getOrNull(c7263m.f119855b, i7)) != null) {
                        Editable text = aVar.f119873o.getText();
                        String string = text != null ? text.toString() : null;
                        Iterator it = ((ArrayList) aVar.f119881w).iterator();
                        int i8 = 0;
                        String str = "";
                        while (true) {
                            String str2 = str;
                            if (!it.hasNext()) {
                                TE0.b bVar2 = TE0.b.f24088a;
                                int i9 = c7263m.f119858e;
                                String str3 = auditReason.f113567c;
                                long j7 = c7263m.f119859f;
                                if (bVar.f119884a == 1) {
                                    str2 = "0";
                                }
                                bVar2.getClass();
                                TE0.b.Z(String.valueOf(i9), str3, j7, str2, string, null);
                                eJ0.t.c(2131849779, aVar.f119873o.getContext());
                                bVar.f119885b = true;
                                auditReason.h = bVar.f119884a;
                                c7263m.notifyItemChanged(i7);
                            } else {
                                Object next = it.next();
                                if (i8 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                Object tag = ((TextView) next).getTag();
                                String string2 = tag != null ? tag.toString() : null;
                                String strA = str2;
                                if (string2 != null) {
                                    if (string2.length() == 0) {
                                        strA = str2;
                                    } else {
                                        String strA2 = N1.p.a(str2, string2);
                                        strA = strA2;
                                        if (i8 < ((ArrayList) aVar.f119881w).size() - 1) {
                                            strA = N1.p.a(strA2, ",");
                                        }
                                    }
                                }
                                i8++;
                                str = strA;
                            }
                        }
                    }
                }
                break;
            default:
                ((MusicPodcastSecondaryFavFragment) this.f77640b).jf(false);
                break;
        }
    }
}

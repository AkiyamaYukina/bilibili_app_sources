package com.bilibili.pegasus.components.interest.ui.v37.page;

import android.widget.TextView;
import aq0.C4838O;
import com.bilibili.biligame.api.user.BiligameSystemMessage;
import com.bilibili.biligame.utils.GameUtils;
import com.bilibili.pegasus.components.interest.C5628b;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionSettingV4Fragment;
import com.bilibili.upper.module.contribute.picker.v3.fragment.AlbumSubFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76892b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f76891a = i7;
        this.f76892b = obj;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f76892b;
        switch (this.f76891a) {
            case 0:
                C4838O c4838o = ((InterestChooseV37ContainerDialog) obj2).f76878b;
                C5628b.a(0, c4838o != null ? c4838o.f53784b : null);
                break;
            case 1:
                ((BiliEditorCaptionSettingV4Fragment) obj2).uf(((Boolean) obj).booleanValue());
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                List list = AlbumSubFragment.t;
                ((AlbumSubFragment) obj2).uf(iIntValue);
                break;
            default:
                BiligameSystemMessage biligameSystemMessage = (BiligameSystemMessage) obj2;
                ((TextView) obj).setText(GameUtils.formatGameName(biligameSystemMessage.gameName, biligameSystemMessage.expandedName));
                break;
        }
        return Unit.INSTANCE;
    }
}

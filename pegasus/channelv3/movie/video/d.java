package com.bilibili.pegasus.channelv3.movie.video;

import Fn0.g;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.utils.k;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/d.class */
public final class d extends k<VideoStatusMessage, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChannelMovieVideoFragment f75498a;

    public d(ChannelMovieVideoFragment channelMovieVideoFragment) {
        this.f75498a = channelMovieVideoFragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.RecyclerView$Adapter, uo0.a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.pegasus.utils.k
    public final void a(Map<Long, VideoStatusMessage> map) {
        ?? r02 = this.f75498a.f75484f;
        int i7 = 0;
        for (Object obj : r02.f127916g) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            g gVar = (BasicIndexItem) obj;
            g gVar2 = gVar instanceof g ? gVar : null;
            if (gVar2 != null) {
                VideoStatusMessage videoStatusMessage = (VideoStatusMessage) ((HashMap) map).get(Long.valueOf(gVar2.getAid()));
                if (videoStatusMessage != null) {
                    gVar2.updateByMsg(videoStatusMessage);
                    r02.notifyItemChanged(i7);
                }
            }
            i7++;
        }
    }
}

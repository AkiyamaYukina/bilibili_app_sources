package com.bilibili.tgwt.chatroom;

import Kj0.b;
import com.bilibili.bangumi.logic.page.detail.service.refactor.SetupJsb;
import com.bilibili.lib.accounts.BiliAccounts;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Named;
import kotlin.Pair;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/f.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class f implements Factory<SetupJsb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f110985a;

    public f(e eVar, yW0.b bVar) {
        this.f110985a = bVar;
    }

    public final Object get() {
        final ChatRoomManagerService chatRoomManagerService = (ChatRoomManagerService) this.f110985a.get();
        final BiliAccounts biliAccounts = (BiliAccounts) b.a.f12954a.get();
        return (SetupJsb) Preconditions.checkNotNullFromProvides(new SetupJsb(chatRoomManagerService, biliAccounts) { // from class: com.bilibili.tgwt.chatroom.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatRoomManagerService f110983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliAccounts f110984b;

            {
                this.f110983a = chatRoomManagerService;
                this.f110984b = biliAccounts;
            }

            public final void invoke(com.bilibili.ogv.infra.jsb.d dVar) {
                dVar.a(new com.bilibili.ogv.infra.jsb.f(this.f110983a, this.f110984b) { // from class: com.bilibili.tgwt.chatroom.ChatroomJsbModule$provide$1$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChatRoomManagerService f110952a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final BiliAccounts f110953b;

                    {
                        this.f110952a = chatRoomManagerService;
                        this.f110953b = biliAccounts;
                    }

                    public final void changeSeason(@Named("season_id") long j7, @Named("ep_id") long j8) {
                        ChatRoomManagerService chatRoomManagerService2 = this.f110952a;
                        c cVarH = chatRoomManagerService2.h();
                        if (cVarH != null) {
                            if (cVarH.f110974c == this.f110953b.mid()) {
                                chatRoomManagerService2.f110899M.tryEmit(new Pair(Long.valueOf(j7), Long.valueOf(j8)));
                            }
                        }
                    }
                }, "togetherWatch");
            }
        });
    }
}

package com.bilibili.music.podcast.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.DetailItem;
import com.bapis.bilibili.app.listener.v1.EventTracking;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bapis.bilibili.app.listener.v1.TopCard;
import com.bapis.bilibili.app.listener.v1.TpcdFavFolder;
import com.bapis.bilibili.app.listener.v1.TpcdHistory;
import com.bapis.bilibili.app.listener.v1.TpcdPickToday;
import com.bapis.bilibili.app.listener.v1.TpcdUpRecall;
import com.bilibili.music.podcast.utils.InterfaceC5425e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicRecommendTopCard.class */
@Keep
public final class MusicRecommendTopCard implements Parcelable, InterfaceC5425e {

    @NotNull
    public static final a CREATOR = new Object();
    private int adapterBindPosition;
    private boolean isReported;

    @Nullable
    private TopCard topCar;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicRecommendTopCard$a.class */
    public static final class a implements Parcelable.Creator<MusicRecommendTopCard> {
        @Override // android.os.Parcelable.Creator
        public final MusicRecommendTopCard createFromParcel(Parcel parcel) {
            return new MusicRecommendTopCard(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MusicRecommendTopCard[] newArray(int i7) {
            return new MusicRecommendTopCard[i7];
        }
    }

    public MusicRecommendTopCard() {
    }

    public MusicRecommendTopCard(@NotNull Parcel parcel) {
        this();
    }

    public MusicRecommendTopCard(@NotNull TopCard topCard) {
        this.topCar = topCard;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAdapterBindPosition() {
        return this.adapterBindPosition;
    }

    @Nullable
    public final EventTracking getEventTracking() {
        EventTracking et;
        TopCard topCard = this.topCar;
        Integer numValueOf = topCard != null ? Integer.valueOf(topCard.getCardTypeValue()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            TopCard topCard2 = this.topCar;
            et = null;
            if (topCard2 != null) {
                TpcdHistory listenHistory = topCard2.getListenHistory();
                et = null;
                if (listenHistory != null) {
                    DetailItem item = listenHistory.getItem();
                    et = null;
                    if (item != null) {
                        PlayItem item2 = item.getItem();
                        et = null;
                        if (item2 != null) {
                            et = item2.getEt();
                        }
                    }
                }
            }
        } else if (numValueOf != null && numValueOf.intValue() == 4) {
            TopCard topCard3 = this.topCar;
            et = null;
            if (topCard3 != null) {
                TpcdPickToday pickToday = topCard3.getPickToday();
                et = null;
                if (pickToday != null) {
                    DetailItem item3 = pickToday.getItem();
                    et = null;
                    if (item3 != null) {
                        PlayItem item4 = item3.getItem();
                        et = null;
                        if (item4 != null) {
                            et = item4.getEt();
                        }
                    }
                }
            }
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            TopCard topCard4 = this.topCar;
            et = null;
            if (topCard4 != null) {
                TpcdUpRecall upRecall = topCard4.getUpRecall();
                et = null;
                if (upRecall != null) {
                    DetailItem item5 = upRecall.getItem();
                    et = null;
                    if (item5 != null) {
                        PlayItem item6 = item5.getItem();
                        et = null;
                        if (item6 != null) {
                            et = item6.getEt();
                        }
                    }
                }
            }
        } else if (numValueOf == null) {
            et = null;
        } else {
            et = null;
            if (numValueOf.intValue() == 2) {
                TopCard topCard5 = this.topCar;
                et = null;
                if (topCard5 != null) {
                    TpcdFavFolder favFolder = topCard5.getFavFolder();
                    et = null;
                    if (favFolder != null) {
                        DetailItem item7 = favFolder.getItem();
                        et = null;
                        if (item7 != null) {
                            PlayItem item8 = item7.getItem();
                            et = null;
                            if (item8 != null) {
                                et = item8.getEt();
                            }
                        }
                    }
                }
            }
        }
        return et;
    }

    @Nullable
    public final TopCard getTopCar() {
        return this.topCar;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public boolean isReported() {
        return this.isReported;
    }

    public final int reportCarType() {
        TopCard topCard = this.topCar;
        Integer numValueOf = topCard != null ? Integer.valueOf(topCard.getCardTypeValue()) : null;
        return (numValueOf != null && numValueOf.intValue() == 3) ? 1 : 2;
    }

    public final void setAdapterBindPosition(int i7) {
        this.adapterBindPosition = i7;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public void setReported(boolean z6) {
        this.isReported = z6;
    }

    public final void setTopCar(@Nullable TopCard topCard) {
        this.topCar = topCard;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
    }
}

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  kotlinx.parcelize.Parcelize
 */
package com.example.myapplication2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006 "}, d2={"Lcom/example/myapplication2/tense;", "Landroid/os/Parcelable;", "name", "", "foto", "", "materi", "contoh", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContoh", "()Ljava/lang/String;", "getFoto", "()I", "getMateri", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@Parcelize
public final class tense
implements Parcelable {
    @NotNull
    private final String name;
    private final int foto;
    @NotNull
    private final String materi;
    @NotNull
    private final String contoh;
    @NotNull
    public static final Parcelable.Creator<tense> CREATOR;

    public tense(@NotNull String name, int foto, @NotNull String materi, @NotNull String contoh) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(materi, "materi");
        Intrinsics.checkNotNullParameter(contoh, "contoh");
        this.name = name;
        this.foto = foto;
        this.materi = materi;
        this.contoh = contoh;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getFoto() {
        return this.foto;
    }

    @NotNull
    public final String getMateri() {
        return this.materi;
    }

    @NotNull
    public final String getContoh() {
        return this.contoh;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.foto;
    }

    @NotNull
    public final String component3() {
        return this.materi;
    }

    @NotNull
    public final String component4() {
        return this.contoh;
    }

    @NotNull
    public final tense copy(@NotNull String name, int foto, @NotNull String materi, @NotNull String contoh) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(materi, "materi");
        Intrinsics.checkNotNullParameter(contoh, "contoh");
        return new tense(name, foto, materi, contoh);
    }

    public static /* synthetic */ tense copy$default(tense tense2, String string, int n, String string2, String string3, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = tense2.name;
        }
        if ((n2 & 2) != 0) {
            n = tense2.foto;
        }
        if ((n2 & 4) != 0) {
            string2 = tense2.materi;
        }
        if ((n2 & 8) != 0) {
            string3 = tense2.contoh;
        }
        return tense2.copy(string, n, string2, string3);
    }

    @NotNull
    public String toString() {
        return "tense(name=" + this.name + ", foto=" + this.foto + ", materi=" + this.materi + ", contoh=" + this.contoh + ')';
    }

    public int hashCode() {
        int result = this.name.hashCode();
        result = result * 31 + Integer.hashCode(this.foto);
        result = result * 31 + this.materi.hashCode();
        result = result * 31 + this.contoh.hashCode();
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tense)) {
            return false;
        }
        tense tense2 = (tense)other;
        if (!Intrinsics.areEqual(this.name, tense2.name)) {
            return false;
        }
        if (this.foto != tense2.foto) {
            return false;
        }
        if (!Intrinsics.areEqual(this.materi, tense2.materi)) {
            return false;
        }
        return Intrinsics.areEqual(this.contoh, tense2.contoh);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NotNull Parcel out, int flags) {
        Intrinsics.checkNotNullParameter((Object)out, "out");
        out.writeString(this.name);
        out.writeInt(this.foto);
        out.writeString(this.materi);
        out.writeString(this.contoh);
    }

    static {
        @Metadata(mv={1, 8, 0}, k=3, xi=48)
        public final class Creator
        implements Parcelable.Creator<tense> {
            @NotNull
            public final tense[] newArray(int size) {
                return new tense[size];
            }

            @NotNull
            public final tense createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
                return new tense(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            }
        }
        CREATOR = new Creator();
    }
}

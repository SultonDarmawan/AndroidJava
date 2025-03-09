/*
 * Decompiled with CFR 0.150.
 */
package com.example.myapplication2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0016"}, d2={"Lcom/example/myapplication2/QuizResult;", "", "score", "", "date", "", "time", "(ILjava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getScore", "()I", "getTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class QuizResult {
    private final int score;
    @NotNull
    private final String date;
    @NotNull
    private final String time;

    public QuizResult(int score, @NotNull String date, @NotNull String time) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        this.score = score;
        this.date = date;
        this.time = time;
    }

    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public final int component1() {
        return this.score;
    }

    @NotNull
    public final String component2() {
        return this.date;
    }

    @NotNull
    public final String component3() {
        return this.time;
    }

    @NotNull
    public final QuizResult copy(int score, @NotNull String date, @NotNull String time) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        return new QuizResult(score, date, time);
    }

    public static /* synthetic */ QuizResult copy$default(QuizResult quizResult, int n, String string, String string2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = quizResult.score;
        }
        if ((n2 & 2) != 0) {
            string = quizResult.date;
        }
        if ((n2 & 4) != 0) {
            string2 = quizResult.time;
        }
        return quizResult.copy(n, string, string2);
    }

    @NotNull
    public String toString() {
        return "QuizResult(score=" + this.score + ", date=" + this.date + ", time=" + this.time + ')';
    }

    public int hashCode() {
        int result = Integer.hashCode(this.score);
        result = result * 31 + this.date.hashCode();
        result = result * 31 + this.time.hashCode();
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizResult)) {
            return false;
        }
        QuizResult quizResult = (QuizResult)other;
        if (this.score != quizResult.score) {
            return false;
        }
        if (!Intrinsics.areEqual(this.date, quizResult.date)) {
            return false;
        }
        return Intrinsics.areEqual(this.time, quizResult.time);
    }
}

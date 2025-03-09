/*
 * Decompiled with CFR 0.150.
 */
package com.example.myapplication2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015\u00a8\u0006+"}, d2={"Lcom/example/myapplication2/Questions;", "", "id", "", "question", "", "optionOne", "optionTwo", "optionThree", "optionFour", "answer", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAnswer", "()I", "setAnswer", "(I)V", "getId", "setId", "getOptionFour", "()Ljava/lang/String;", "setOptionFour", "(Ljava/lang/String;)V", "getOptionOne", "setOptionOne", "getOptionThree", "setOptionThree", "getOptionTwo", "setOptionTwo", "getQuestion", "setQuestion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Questions {
    private int id;
    @NotNull
    private String question;
    @NotNull
    private String optionOne;
    @NotNull
    private String optionTwo;
    @NotNull
    private String optionThree;
    @NotNull
    private String optionFour;
    private int answer;

    public Questions(int id, @NotNull String question, @NotNull String optionOne, @NotNull String optionTwo, @NotNull String optionThree, @NotNull String optionFour, int answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(optionOne, "optionOne");
        Intrinsics.checkNotNullParameter(optionTwo, "optionTwo");
        Intrinsics.checkNotNullParameter(optionThree, "optionThree");
        Intrinsics.checkNotNullParameter(optionFour, "optionFour");
        this.id = id;
        this.question = question;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.answer = answer;
    }

    public /* synthetic */ Questions(int n, String string, String string2, String string3, String string4, String string5, int n2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            string = "";
        }
        if ((n3 & 4) != 0) {
            string2 = "";
        }
        if ((n3 & 8) != 0) {
            string3 = "";
        }
        if ((n3 & 0x10) != 0) {
            string4 = "";
        }
        if ((n3 & 0x20) != 0) {
            string5 = "";
        }
        if ((n3 & 0x40) != 0) {
            n2 = 0;
        }
        this(n, string, string2, string3, string4, string5, n2);
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int n) {
        this.id = n;
    }

    @NotNull
    public final String getQuestion() {
        return this.question;
    }

    public final void setQuestion(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.question = string;
    }

    @NotNull
    public final String getOptionOne() {
        return this.optionOne;
    }

    public final void setOptionOne(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.optionOne = string;
    }

    @NotNull
    public final String getOptionTwo() {
        return this.optionTwo;
    }

    public final void setOptionTwo(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.optionTwo = string;
    }

    @NotNull
    public final String getOptionThree() {
        return this.optionThree;
    }

    public final void setOptionThree(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.optionThree = string;
    }

    @NotNull
    public final String getOptionFour() {
        return this.optionFour;
    }

    public final void setOptionFour(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.optionFour = string;
    }

    public final int getAnswer() {
        return this.answer;
    }

    public final void setAnswer(int n) {
        this.answer = n;
    }

    public final int component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.question;
    }

    @NotNull
    public final String component3() {
        return this.optionOne;
    }

    @NotNull
    public final String component4() {
        return this.optionTwo;
    }

    @NotNull
    public final String component5() {
        return this.optionThree;
    }

    @NotNull
    public final String component6() {
        return this.optionFour;
    }

    public final int component7() {
        return this.answer;
    }

    @NotNull
    public final Questions copy(int id, @NotNull String question, @NotNull String optionOne, @NotNull String optionTwo, @NotNull String optionThree, @NotNull String optionFour, int answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(optionOne, "optionOne");
        Intrinsics.checkNotNullParameter(optionTwo, "optionTwo");
        Intrinsics.checkNotNullParameter(optionThree, "optionThree");
        Intrinsics.checkNotNullParameter(optionFour, "optionFour");
        return new Questions(id, question, optionOne, optionTwo, optionThree, optionFour, answer);
    }

    public static /* synthetic */ Questions copy$default(Questions questions, int n, String string, String string2, String string3, String string4, String string5, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = questions.id;
        }
        if ((n3 & 2) != 0) {
            string = questions.question;
        }
        if ((n3 & 4) != 0) {
            string2 = questions.optionOne;
        }
        if ((n3 & 8) != 0) {
            string3 = questions.optionTwo;
        }
        if ((n3 & 0x10) != 0) {
            string4 = questions.optionThree;
        }
        if ((n3 & 0x20) != 0) {
            string5 = questions.optionFour;
        }
        if ((n3 & 0x40) != 0) {
            n2 = questions.answer;
        }
        return questions.copy(n, string, string2, string3, string4, string5, n2);
    }

    @NotNull
    public String toString() {
        return "Questions(id=" + this.id + ", question=" + this.question + ", optionOne=" + this.optionOne + ", optionTwo=" + this.optionTwo + ", optionThree=" + this.optionThree + ", optionFour=" + this.optionFour + ", answer=" + this.answer + ')';
    }

    public int hashCode() {
        int result = Integer.hashCode(this.id);
        result = result * 31 + this.question.hashCode();
        result = result * 31 + this.optionOne.hashCode();
        result = result * 31 + this.optionTwo.hashCode();
        result = result * 31 + this.optionThree.hashCode();
        result = result * 31 + this.optionFour.hashCode();
        result = result * 31 + Integer.hashCode(this.answer);
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Questions)) {
            return false;
        }
        Questions questions = (Questions)other;
        if (this.id != questions.id) {
            return false;
        }
        if (!Intrinsics.areEqual(this.question, questions.question)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.optionOne, questions.optionOne)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.optionTwo, questions.optionTwo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.optionThree, questions.optionThree)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.optionFour, questions.optionFour)) {
            return false;
        }
        return this.answer == questions.answer;
    }

    public Questions() {
        this(0, null, null, null, null, null, 0, 127, null);
    }
}

package lotto.controller;

import lotto.domain.LotteryMachine;
import lotto.domain.Lotto;
import lotto.model.RankSummary;
import lotto.ui.InputView;
import lotto.ui.ResultView;

public class LottoController {

    public static void main(String[] args) {
        int purchasePrice = InputView.readPurchasePrice();
        LotteryMachine lotteryMachine = new LotteryMachine(purchasePrice);
        ResultView.printLottoInfo(lotteryMachine);

        Lotto winningLotto = new Lotto(InputView.readWinningLottoNumber());
        RankSummary rankSummary = lotteryMachine.calculateRankSummary(winningLotto);
        ResultView.printRankSummary(rankSummary);
    }
}

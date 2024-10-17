package lotto.controller;

import lotto.domain.LotteryMachine;
import lotto.domain.Lotto;
import lotto.domain.WinningStatistics;
import lotto.ui.InputView;
import lotto.ui.ResultView;

public class LottoController {

    public static void main(String[] args) {
        int purchasePrice = InputView.readPurchasePrice();
        LotteryMachine lotteryMachine = new LotteryMachine(purchasePrice);
        ResultView.printLottoInfo(lotteryMachine);

        Lotto winningLotto = new Lotto(InputView.readWinningLottoNumber());
        ResultView.printWinningStatistics(new WinningStatistics(lotteryMachine, winningLotto));
    }
}

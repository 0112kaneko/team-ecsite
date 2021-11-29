package jp.co.internous.nova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.nova.model.domain.dto.PurchaseHistoryDto;
import jp.co.internous.nova.model.mapper.TblPurchaseHistoryMapper;
import jp.co.internous.nova.model.session.LoginSession;

/**
 * 購入履歴情報に関する処理を行うコントローラー
 * @author 0112kaneko
 *
 */
@Controller
@RequestMapping("/nova/history")
public class PurchaseHistoryController {

	@Autowired
	private LoginSession loginSession;
	
	@Autowired
	private TblPurchaseHistoryMapper purchasehistoryMapper;
	
	/**
	 * 購入履歴画面を初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return 購入履歴画面
	 */
	@RequestMapping("/") 
	public String index(Model m) {
		int userId = loginSession.getUserId();
		List<PurchaseHistoryDto> historyList = purchasehistoryMapper.findByUserId(userId);
		
		m.addAttribute("historyList",historyList);
		m.addAttribute("loginSession",loginSession);
		
		return "purchase_history";
	}

	/**
	 * 購入履歴情報を論理削除する
	 * @return true:削除成功、false:削除失敗
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public boolean delete() {
		int userId = loginSession.getUserId();
		int result = purchasehistoryMapper.logicalDeleteByUserId(userId);
		
		return result > 0;
	}
}
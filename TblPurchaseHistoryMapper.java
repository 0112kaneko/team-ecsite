package jp.co.internous.nova.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.nova.model.domain.dto.PurchaseHistoryDto;

/**
 * tbl_purchase_historyにアクセスするDAO
 * @author 0112kaneko
 *
 */
@Mapper
public interface TblPurchaseHistoryMapper {
	/**
	 * 購入履歴情報を登録する
	 * @param parameter パラメーター(ユーザーID、宛先情報ID)
	 * @return 登録件数
	 */
	int insert(Map<String, Object> parameter);
	
	/**
	 * ユーザーIDを条件に購入履歴情報を取得する
	 * @param userId ユーザーID
	 * @return 購入履歴情報リスト
	 */
	List<PurchaseHistoryDto> findByUserId(@Param("userId") int userId);
	
	/**
	 * ユーザーIDを条件に論理削除する
	 * @param userId ユーザーID
	 * @return 削除件数
	 */
	@Update("UPDATE tbl_purchase_history SET status = 0, updated_at = now() WHERE user_id = #{userId}")
	int logicalDeleteByUserId(@Param("userId") int userId);
}
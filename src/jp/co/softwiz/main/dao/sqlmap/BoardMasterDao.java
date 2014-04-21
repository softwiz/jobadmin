/*
	 * タイトル：カテゴリDaoImpl
	 * 説明    ：
	 *
	 * 著作権  ：Copyright(c) 2014 SOFTWIZ
	 * 会社名  ：株式会社 SOFTWIZ
	 *
	 * 変更履歴   ：2014/04/03
	 * 新規登録   :
*/

package jp.co.softwiz.main.dao.sqlmap;

import java.util.List;

import jp.co.softwiz.main.domain.admin.BoardMasterInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class BoardMasterDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<BoardMasterInfoBean> selectList(BoardMasterInfoBean bean){
		return sqlSessionTemplate.selectList("BoardMaster.selectList", bean);
	}

	public BoardMasterInfoBean select(BoardMasterInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TBoardMasterInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(BoardMasterInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TBoardMasterInfoMapper.insert", bean);
	}

	public void update(BoardMasterInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TBoardMasterInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(BoardMasterInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TBoardMasterInfoMapper.deleteByPrimaryKey", bean);
	}
}

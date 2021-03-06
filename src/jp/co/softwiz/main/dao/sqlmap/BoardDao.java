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

import jp.co.softwiz.main.domain.admin.BoardInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class BoardDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<BoardInfoBean> selectList(BoardInfoBean bean){
		return sqlSessionTemplate.selectList("Board.selectList", bean);
	}

	public BoardInfoBean select(BoardInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TBoardInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(BoardInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TBoardInfoMapper.insert", bean);
	}

	public void update(BoardInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TBoardInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(BoardInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TBoardInfoMapper.deleteByPrimaryKey", bean);
	}
}

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

import jp.co.softwiz.main.domain.admin.BoardFileInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class BoardFileDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<BoardFileInfoBean> selectList(BoardFileInfoBean bean){
		return sqlSessionTemplate.selectList("BoardFile.selectList", bean);
	}

	public BoardFileInfoBean select(BoardFileInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TBoardFileInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(BoardFileInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TBoardFileInfoMapper.insert", bean);
	}

	public void update(BoardFileInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TBoardFileInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(BoardFileInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TBoardFileInfoMapper.deleteByPrimaryKey", bean);
	}
}

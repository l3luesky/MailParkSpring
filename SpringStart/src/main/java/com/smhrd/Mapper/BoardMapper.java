package com.smhrd.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.entity.Board;

@Mapper
public interface BoardMapper {
	public List<Board> getList();
	public void boardInsert(Board vo);

}

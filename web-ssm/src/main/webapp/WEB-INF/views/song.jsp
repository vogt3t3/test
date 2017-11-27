<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            </div>
            <div class="modal-body">
                <form action="${pageContext.request.contextPath }/song/updatesong.do" method="post">
                    <input type="hidden" name="songid" id="songid"/>
                    名称：<input type="text" name="songname" id="songname" /><br/>
                    播放路径：<input type="text" name="urlpath" id="urlpath" /><br/>
                    歌手id：<input type="text" name="singerid" id="singerid" /><br/>
                    <input type="submit" name="update" value="修改"/>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
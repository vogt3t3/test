<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            </div>
            <div class="modal-body">
                <form action="${pageContext.request.contextPath }/singer/updatesinger.do" method="post">
                    <input type="hidden" name="singerid" id="singerid"/>
                    姓名：<input type="text" name="sname" id="sname" /><br/>
                    生日：<input type="text" name="birthday" id="birthday" /><br/>
                    地区：<input type="text" name="region" id="region" /><br/>
                    <input type="submit" name="update" value="修改"/>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%@ page contentType="application/json" %>
<g:applyCodec name="Raw">
[
	<g:each status="i" in="${personInstanceList}" var="p">
		"${p.firstName.encodeAsJavaScript()}"		<g:if test="${i != personInstanceList.size()-1}">,</g:if>
	</g:each>
]
</g:applyCodec>
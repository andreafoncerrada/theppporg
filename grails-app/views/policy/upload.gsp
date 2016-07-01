<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="pphub">
    <title>Upload</title>
  </head>

  <body>
    <div id="upload-data" class="content scaffold-create" role="main">
      <div class="content scaffold-create" role="main">
        <h1>Upload Data</h1>
        <g:if test="${flash.message}"><div class="message" role="status">${flash.message}</div></g:if>
        <g:uploadForm action="doUpload">
        <fieldset class="form">
          <input type="file" name="file" />
        </fieldset>
        <br />
        <fieldset class="buttons">
          <g:submitButton name="doUpload" value="Upload" class="btn  btn-primary" />
        </fieldset>
        </g:uploadForm>
      </div>
    </div>
  </body>
</html>

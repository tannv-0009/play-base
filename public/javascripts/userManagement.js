$('#checkAll').change(function(){
    var checkboxes = $(this).closest('form').find(':checkbox');
    if($(this).prop('checked')) {
        checkboxes.prop('checked', true);
    } else {
        checkboxes.prop('checked', false);
    }
});

$('#deleteForm').submit(function() {
    return confirm("Are you sure you want to delete record(s)?");
});
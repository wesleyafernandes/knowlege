zk.afterMount(function() {
	var binder = zkbind.$('$knowledge');
	binder.after('carregaChamados',function() {
		binder.checked = true;
	});
});

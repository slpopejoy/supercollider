// idea by adc, mods by /f0, jrh, mc, ...

		// so just call the parent window.
	
	w { 
		warn("" ++ this.class ++ ":w is deprecated. use .window instead.") 
		^window 
	}
	
		this.makeWindow;
					if (mod.notNil and: { mod.isAlt }) { 
						NodeProxyEditor(pxmon.proxy);					} { 
					};

	highlightSlots { |parOffset, num| 
		var onCol = Color(1, 0.5, 0.5);
		var offCol = Color.clear;
		{ pxMons.do { |moni, i| 
			var col = if (i >= parOffset and: (i < (parOffset + num).max(0)), onCol, offCol); 
			moni.nameView.background_(col.green_([0.5, 0.7].wrapAt(i - parOffset div: 2)));
		} }.defer;
	}
	